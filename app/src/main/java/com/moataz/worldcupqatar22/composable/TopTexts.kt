package com.moataz.worldcupqatar22.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TopText(text: String, fontSize: TextUnit, modifier: Modifier = Modifier) {
    Text(
        text = text,
        color = Color.White,
        fontSize = fontSize,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}