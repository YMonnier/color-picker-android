package com.yseemonnier.mycolors.common

interface CommonMapper<E, D> {
    fun toDto(entity: E): D

    fun toEntity(dto: D): E
}
