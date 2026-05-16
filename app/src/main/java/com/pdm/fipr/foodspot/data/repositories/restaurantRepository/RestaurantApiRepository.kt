package com.pdm.fipr.foodspot.data.repositories.restaurantRepository

import com.pdm.fipr.foodspot.dummy.dummyRestaurants
import com.pdm.fipr.foodspot.model.Restaurant
import kotlinx.coroutines.delay

class RestaurantApiRepository : RestaurantRepository {
    override suspend fun getRestaurants(): List<Restaurant> {
        delay(2000)
        return dummyRestaurants
    }

    override suspend fun getRestaurantById(id: Int): Restaurant? {
        delay(3000)
        return dummyRestaurants.find { it.id == id }
    }

    override suspend fun searchRestaurants(query: String): List<Restaurant> {

        if (query.isEmpty()) return emptyList()

        val lowerCaseQuery = query.lowercase()

        return dummyRestaurants.filter { restaurant ->
            val matchesName = restaurant.name.lowercase().contains(lowerCaseQuery)
            val matchesDish = restaurant.menu.any { dish -> dish.name.lowercase().contains(lowerCaseQuery) }
            matchesName || matchesDish
        }
    }


    override suspend fun getCategories(): List<String> {
        return dummyRestaurants.flatMap { it.categories }.distinct()
    }

}