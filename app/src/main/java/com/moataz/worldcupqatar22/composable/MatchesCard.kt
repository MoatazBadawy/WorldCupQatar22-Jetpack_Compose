package com.moataz.worldcupqatar22.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MatchesCard(
    paddingVertical: Dp = 0.dp,
    teamOne: String,
    time: String,
    teamTwo: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 18.dp,
                vertical = paddingVertical
            ),

        backgroundColor = Color.White,
        elevation = 0.dp,
        shape = RoundedCornerShape(24.dp),
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .size(20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = teamOne,
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = time,
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = teamTwo,
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}