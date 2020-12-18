package com.yseemonnier.mycolors.color

import com.yseemonnier.mycolors.color.entities.ColorEntity

interface ColorRepositoryInterface {
    suspend fun getColorName(color: ColorEntity): String
}
