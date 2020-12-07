package com.yseemonnier.mycolors.color.remote.service

import com.yseemonnier.mycolors.color.remote.dto.ColorRemoteColorDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ColorNameService {
    @GET("id")
    suspend fun getColorName(@Query("hex") hex: String): ColorRemoteColorDto
}
