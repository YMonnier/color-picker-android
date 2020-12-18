package com.yseemonnier.mycolors.color.remote.dataSource

import com.yseemonnier.mycolors.color.entities.ColorEntity

interface ColorRemoteDataSourceInterface {
    suspend fun getColorName(color: ColorEntity): String
}
