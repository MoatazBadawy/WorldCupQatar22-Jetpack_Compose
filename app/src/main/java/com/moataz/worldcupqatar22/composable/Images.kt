package com.moataz.worldcupqatar22.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moataz.worldcupqatar22.R

@Composable
fun ImageBackground() {
    Image(
        painter = painterResource(id = R.drawable.background_one),
        contentDescription = "Background",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun ImageLogo() {
    Image(
        painter = painterResource(id = R.drawable.logo_test),
        contentDescription = "Logo",
        modifier = Modifier.padding(top = 52.dp)
    )
}