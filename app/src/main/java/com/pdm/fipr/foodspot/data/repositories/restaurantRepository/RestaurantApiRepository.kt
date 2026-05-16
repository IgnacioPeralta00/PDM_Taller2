package com.pdm.fipr.foodspot.data.repositories.restaurantRepository

import java.text.Normalizer
import com.pdm.fipr.foodspot.dummy.dummyRestaurants
import com.pdm.fipr.foodspot.model.Restaurant

fun String.normalize(): String {
    val temp = Normalizer.normalize(this, Normalizer.Form.NFD)
    return Regex("\\p{InCombiningDiacriticalMarks}+")
        .replace(temp, "")
        .lowercase()
}

class RestaurantApiRepository : RestaurantRepository {
    override suspend fun getRestaurants(): List<Restaurant> {
        //delay(2000)
        return dummyRestaurants
    }

    override suspend fun getRestaurantById(id: Int): Restaurant? {
        //delay(3000)
        return dummyRestaurants.find { it.id == id }
    }

    override suspend fun searchRestaurants(query: String): List<Restaurant> {

        if (query.isEmpty()) return emptyList()

        val normalizedQuery = query.normalize()

        return dummyRestaurants.filter { restaurant ->
            val matchesName = restaurant.name.normalize().contains(normalizedQuery)
            val matchesDish = restaurant.menu.any { dish -> dish.name.normalize().contains(normalizedQuery) }
            matchesName || matchesDish
        }
    }


    override suspend fun getCategories(): List<String> {
        return dummyRestaurants.flatMap { it.categories }.distinct()
    }

}