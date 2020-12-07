package com.yseemonnier.mycolors.color.remote.dataSource

import com.yseemonnier.mycolors.color.entities.Color
import com.yseemonnier.mycolors.color.entities.ColorRgb

interface ColorRemoteDataSourceInterface {
    suspend fun getColorName(color: Color): String
}
