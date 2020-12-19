package com.yseemonnier.mycolors.api

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class ColorApi(baseUrl: String, private val debug: Boolean = true) {

    val retrofit: Retrofit

    init {
        val moshi = Moshi.Builder().build()

        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(getHttpClient())
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    private fun getHttpClient() : OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        val level = if (debug) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }

        loggingInterceptor.level = level

        return OkHttpClient().newBuilder().apply {
            readTimeout(HTTP_READ_TIMEOUT, TIMEOUT_UNIT)
            writeTimeout(HTTP_WRITE_TIMEOUT, TIMEOUT_UNIT)
            connectTimeout(HTTP_CONNECT_TIMEOUT, TIMEOUT_UNIT)

            addInterceptor(loggingInterceptor)
        }.build()
    }

    private companion object {
        private val TIMEOUT_UNIT = TimeUnit.SECONDS
        private const val HTTP_CONNECT_TIMEOUT = 10L
        private const val HTTP_WRITE_TIMEOUT = 30L
        private const val HTTP_READ_TIMEOUT = 20L
    }
}
