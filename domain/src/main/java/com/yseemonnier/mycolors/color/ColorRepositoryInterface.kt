package com.yseemonnier.mycolors.color

import com.yseemonnier.mycolors.color.entities.Color

interface ColorRepositoryInterface {
    suspend fun getColorName(color: Color): String
}
