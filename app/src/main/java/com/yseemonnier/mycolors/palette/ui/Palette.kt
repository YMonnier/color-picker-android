package com.yseemonnier.mycolors.palette.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.ui.tooling.preview.Preview
import com.yseemonnier.mycolors.R
import com.yseemonnier.mycolors.common.MyColorsTheme
import com.yseemonnier.mycolors.common.ui.CommonHeader

@Composable
fun PaletteScreen(colorItems: List<Color>) {
    MyColorsTheme {
        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
        ) {
            CommonHeader(
                titleRes = R.string.palette_title,
                descriptionRes = R.string.palette_description,
            )
            LazyColumnFor(colorItems) {
                PaletteItem(it)
            }
        }
    }
}

@Preview
@Composable
private fun PaletteScreenPreview() {
    PaletteScreen(
        listOf(
            Color.Black,
            Color.Red,
            Color.Magenta,
            Color.Yellow,
            Color.Blue,
        )
    )
}
