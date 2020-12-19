package com.yseemonnier.mycolors

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.setContent
import com.yseemonnier.mycolors.common.utils.Clipboard
import com.yseemonnier.mycolors.palette.ui.PaletteListener
import com.yseemonnier.mycolors.palette.ui.PaletteScreen

class MainActivity : AppCompatActivity(), PaletteListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PaletteScreen(
                colorItems = listOf(
                    Color.Black,
                    Color.Red,
                    Color.Magenta,
                    Color.Yellow,
                    Color.Blue,
                    Color.Black,
                    Color.Red,
                    Color.Magenta,
                    Color.Yellow,
                    Color.Blue,
                    Color.Black,
                    Color.Red,
                    Color.Magenta,
                    Color.Yellow,
                    Color.Blue,
                )
            , this)
        }
    }

    override fun onAddColor() {

    }

    override fun onRemoveColor(index: Int) {

    }

    override fun onCopyColor(color: Color) {
        Clipboard.setClipboard(this, "Color", color.toArgb().toString())
    }
}
