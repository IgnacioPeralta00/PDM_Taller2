package com.pdm.fipr.foodspot.routes

import androidx.navigation3.runtime.NavKey
import com.pdm.fipr.foodspot.model.Restaurant
import kotlinx.serialization.Serializable

sealed class Routes: NavKey {

    @Serializable
    data object Home : Routes()
    @Serializable
    data class Detail(val id: Int) : Routes()
    @Serializable
    data object Search : Routes()

}

