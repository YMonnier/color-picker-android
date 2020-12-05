package com.yseemonnier.mycolors.common

interface CommonUseCase {
    suspend operator fun invoke(foodFilter: FoodFilter = FoodFilter()) =
}
