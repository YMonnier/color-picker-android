package com.yseemonnier.mycolors.common

import kotlinx.coroutines.flow.Flow

interface CommonFlowUseCase<T, R> {
    operator fun invoke(input: Flow<T>): Flow<R>
}
