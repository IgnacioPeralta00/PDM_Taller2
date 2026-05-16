package com.pdm.fipr.foodspot.data.repositories.restaurantRepository

import com.pdm.fipr.foodspot.model.Restaurant

interface RestaurantRepository {
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun getRestaurantById(id: Int): Restaurant?
    suspend fun searchRestaurants(query: String): List<Restaurant>
    suspend fun getCategories(): List<String>

}