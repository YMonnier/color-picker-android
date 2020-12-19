package com.yseemonnier.mycolors.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    primaryVariant = Color.Black,
    secondary = Color.LightGray,
)

private val LightColorPalette = lightColors(
    primary = Color.Black,
    primaryVariant = Color.LightGray,
    secondary = Color.Black,
    background = Color.White,
    surface = Color.White,
)

@Composable
fun MyColorsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
