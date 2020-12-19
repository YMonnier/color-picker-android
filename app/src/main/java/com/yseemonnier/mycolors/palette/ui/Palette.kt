package com.yseemonnier.mycolors.palette.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.yseemonnier.mycolors.R
import com.yseemonnier.mycolors.common.MyColorsTheme
import com.yseemonnier.mycolors.common.ui.CommonHeader

interface PaletteListener {
    fun onAddColor()
    fun onRemoveColor(index: Int)
    fun onCopyColor(color: Color)
}

@Composable
fun PaletteScreen(
    colorItems: List<Color>,
    listener: PaletteListener? = null,
) {
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
            LazyColumnFor(
                items = colorItems,
                modifier = Modifier.weight(1.0f),
            ) {
                PaletteItem(it, object : PaletteItemListener {
                    override fun onCopyColor() {
                        listener?.onCopyColor(it)
                    }
                })
            }
            TextButton(
                onClick = { listener?.onAddColor() },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(BUTTON_HEIGHT)
                    .background(MaterialTheme.colors.background),
            ) {
                Text(
                    text = stringResource(R.string.palette_add_color),
                )
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

private val BUTTON_HEIGHT = 100.dp
