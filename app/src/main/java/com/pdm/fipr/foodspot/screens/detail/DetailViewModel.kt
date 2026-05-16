package com.pdm.fipr.foodspot.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm.fipr.foodspot.data.repositories.restaurantRepository.RestaurantApiRepository
import com.pdm.fipr.foodspot.data.repositories.restaurantRepository.RestaurantRepository
import com.pdm.fipr.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class DetailUiState(
    val restaurant: Restaurant? = null,
    val loading: Boolean = false,
)

class DetailViewModel: ViewModel()  {
    private val repository: RestaurantRepository = RestaurantApiRepository()
    private val _uiState = MutableStateFlow(DetailUiState(loading = true))
    val uiState = _uiState.asStateFlow()


    fun loadRestaurant(id: Int) {
        _uiState.update { it.copy(restaurant = null, loading = true) }
        viewModelScope.launch {
            val restaurant = repository.getRestaurantById(id)
            _uiState.update {
                it.copy(
                    restaurant = restaurant,
                    loading = false
                )
            }
        }
    }

}