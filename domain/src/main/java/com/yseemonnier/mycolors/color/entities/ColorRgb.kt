package com.yseemonnier.mycolors.color.entities

data class ColorRgb(
    val r: ColorRgbComponent,
    val g: ColorRgbComponent,
    val b: ColorRgbComponent,
) : Color {
    override fun toRgb(): ColorRgb {
        return this
    }
}
