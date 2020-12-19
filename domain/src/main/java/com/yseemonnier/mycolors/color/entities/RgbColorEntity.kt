package com.yseemonnier.mycolors.color.entities

data class RgbColorEntity(
    val r: ColorRgbComponent,
    val g: ColorRgbComponent,
    val b: ColorRgbComponent,
) : Color {
    override fun toRgb(): RgbColorEntity {
        return this
    }
}
