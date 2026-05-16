package com.pdm.fipr.foodspot.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm.fipr.foodspot.data.repositories.restaurantRepository.RestaurantApiRepository
import com.pdm.fipr.foodspot.data.repositories.restaurantRepository.RestaurantRepository
import com.pdm.fipr.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class HomeUiState(
    val categoriesAndRestaurants: Map<String, List<Restaurant>> = emptyMap(),
    val loading: Boolean = false
)

class HomeViewModel: ViewModel() {
    private val repository: RestaurantRepository = RestaurantApiRepository()
    private val _uiState = MutableStateFlow(HomeUiState(loading = true))
    val uiState = _uiState.asStateFlow()

    init {
        loadHome()
    }

    fun loadHome() {
        viewModelScope.launch {
            val restaurants = repository.getRestaurants()
            val categories = repository.getCategories()
            val groupedRestaurants = categories.associateWith { category ->
                restaurants.filter { it.categories.contains(category) }
            }
            _uiState.update { state ->
                state.copy(
                    categoriesAndRestaurants = groupedRestaurants,
                    loading = false
                )
            }
        }
    }

}

