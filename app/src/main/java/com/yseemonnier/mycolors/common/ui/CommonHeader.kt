package com.yseemonnier.mycolors.common.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.ui.tooling.preview.Preview
import com.yseemonnier.mycolors.R
import com.yseemonnier.mycolors.common.mediumSpace
import com.yseemonnier.mycolors.common.typography

@Composable
fun CommonHeader(
    @StringRes titleRes: Int,
    @StringRes descriptionRes: Int,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(mediumSpace),
        modifier = Modifier.padding(mediumSpace)
    ) {
        Text(
            text = stringResource(titleRes),
            style = typography.h5,
            color = MaterialTheme.colors.primary,
        )
        Text(
            text = stringResource(descriptionRes),
            style = typography.subtitle1,
            color = MaterialTheme.colors.secondary,
        )
    }
}

@Preview
@Composable
private fun HeaderPreview() {
    CommonHeader(
        titleRes = R.string.palette_title,
        descriptionRes = R.string.palette_description,
    )
}
