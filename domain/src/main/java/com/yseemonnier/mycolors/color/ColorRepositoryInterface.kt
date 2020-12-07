package com.yseemonnier.mycolors.color

import com.yseemonnier.mycolors.color.entities.Color
import com.yseemonnier.mycolors.color.entities.ColorRgb

interface ColorRepositoryInterface {
    suspend fun getColorName(color: Color): String
}
