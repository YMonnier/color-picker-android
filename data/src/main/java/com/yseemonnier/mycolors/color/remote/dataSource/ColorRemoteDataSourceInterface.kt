package com.yseemonnier.mycolors.color.remote.dataSource

import com.yseemonnier.mycolors.color.entities.Color

interface ColorRemoteDataSourceInterface {
    suspend fun getColorName(color: Color): String
}
