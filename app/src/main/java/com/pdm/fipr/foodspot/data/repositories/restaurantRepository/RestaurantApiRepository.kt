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
        TODO("Not yet implemented")
    }

    override suspend fun getCategories(): List<String> {
        return dummyRestaurants.flatMap { it.categories }.distinct()
    }

}