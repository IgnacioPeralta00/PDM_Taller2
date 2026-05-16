package com.pdm.fipr.foodspot

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm.fipr.foodspot.routes.Routes
import com.pdm.fipr.foodspot.screens.detail.RestaurantsDetailScreen
import com.pdm.fipr.foodspot.screens.home.RestaurantsHomeScreen
import com.pdm.fipr.foodspot.screens.search.RestaurantSearchScreen

@Composable
fun MainNavigation() {
    val backStack = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Home> {
                RestaurantsHomeScreen(
                    onRestaurantClick = { id ->
                        backStack.add(Routes.Detail(id))
                    },
                    onSearchClick = { backStack.add(Routes.Search) }
                )
            }
            entry<Routes.Detail> { entry ->
                RestaurantsDetailScreen(
                    entry.id,
                    navigateBack = { backStack.removeLastOrNull() }
                )
            }
            entry<Routes.Search> {
                RestaurantSearchScreen(
                    onRestaurantClick = { id ->
                        backStack.add(Routes.Detail(id))
                    },
                    navigateBack = { backStack.removeLastOrNull() }
                )
            }
        },
        transitionSpec = {
            slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { -it },
                animationSpec = tween(500)
            )
        },
        popTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(500)
            )
        },
        predictivePopTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(250)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(250)
            )
        }
    )
}