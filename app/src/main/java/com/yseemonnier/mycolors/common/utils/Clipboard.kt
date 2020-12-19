package com.yseemonnier.mycolors.common.utils

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context

object Clipboard {
    fun setClipboard(context: Context, label: String, text: String) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager?
        clipboard?.apply {
            val clip = ClipData.newPlainText(label, text)
            setPrimaryClip(clip)
        }
    }
}
