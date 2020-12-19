package com.yseemonnier.mycolors.palette.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.toHexString
import androidx.ui.tooling.preview.Preview
import com.yseemonnier.mycolors.R
import com.yseemonnier.mycolors.common.mediumSpace

interface PaletteItemListener {
    fun onCopyColor()
}

@Composable
fun PaletteItem(
    color: Color,
    listener: PaletteItemListener? = null,
) {
    Row(
        modifier = Modifier
            .height(HEIGHT)
            .fillMaxWidth()
            .background(color)
            .padding(horizontal = mediumSpace),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = color.toArgb().toHexString(),
            color = Color.White.copy(alpha = TEXT_ALPHA),
        )
        Button(
            onClick = { listener?.onCopyColor() },
        ) {
            Image(
                asset = imageResource(id = R.drawable.ic_copy),
            )
        }
    }
}

@Preview
@Composable
private fun PaletteItemPreview() {
    PaletteItem(Color.Blue)
}

private val HEIGHT = 80.dp
private const val TEXT_ALPHA = 0.75f
