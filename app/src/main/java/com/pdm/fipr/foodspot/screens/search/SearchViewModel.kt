package com.pdm.fipr.foodspot.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm.fipr.foodspot.data.repositories.restaurantRepository.RestaurantApiRepository
import com.pdm.fipr.foodspot.data.repositories.restaurantRepository.RestaurantRepository
import com.pdm.fipr.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class SearchUiState(
    val query: String = "",
    val restaurants: List<Restaurant> = emptyList(),
    val loading: Boolean = false,
    val hasResults: Boolean = false
)

class SearchViewModel: ViewModel() {
    private val repository: RestaurantRepository = RestaurantApiRepository()
    private val _uiState = MutableStateFlow(SearchUiState(loading = true))
    val uiState = _uiState.asStateFlow()

    fun onSearchQueryChange(query: String) {
        viewModelScope.launch {
            val results = repository.searchRestaurants(query)
            _uiState.update {
                it.copy(
                    query = query,
                    restaurants = results,
                    loading = false,
                    hasResults = results.isNotEmpty()
                )
            }
        }
    }

}