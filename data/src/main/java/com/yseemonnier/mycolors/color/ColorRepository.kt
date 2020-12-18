package com.yseemonnier.mycolors.color

import com.yseemonnier.mycolors.color.entities.ColorEntity
import com.yseemonnier.mycolors.color.remote.dataSource.ColorRemoteDataSourceInterface

class ColorRepository(
    private val remoteDataSource: ColorRemoteDataSourceInterface,
) : ColorRepositoryInterface {
    override suspend fun getColorName(color: ColorEntity): String {
        return remoteDataSource.getColorName(color)
    }
}

