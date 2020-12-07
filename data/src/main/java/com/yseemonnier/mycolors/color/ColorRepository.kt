package com.yseemonnier.mycolors.color

import com.yseemonnier.mycolors.color.entities.Color
import com.yseemonnier.mycolors.color.entities.ColorRgb
import com.yseemonnier.mycolors.color.remote.dataSource.ColorRemoteDataSourceInterface

class ColorRepository(
    private val remoteDataSource: ColorRemoteDataSourceInterface,
) : ColorRepositoryInterface {
    override suspend fun getColorName(color: Color): String {
        return remoteDataSource.getColorName(color)
    }
}

