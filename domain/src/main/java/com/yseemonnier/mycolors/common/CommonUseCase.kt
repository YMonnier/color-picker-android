package com.yseemonnier.mycolors.common

interface CommonAsyncUseCase<T, R> {
    suspend operator fun invoke(input: T): R
}
