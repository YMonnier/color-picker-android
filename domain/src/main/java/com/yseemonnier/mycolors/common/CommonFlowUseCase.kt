package com.yseemonnier.mycolors.common

interface CommonUseCase<T, R> {
    operator fun invoke(input: T): R
}
