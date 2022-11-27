package com.moataz.worldcupqatar22.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moataz.worldcupqatar22.composable.ImageBackground
import com.moataz.worldcupqatar22.composable.ImageLogo
import com.moataz.worldcupqatar22.composable.MatchesCard
import com.moataz.worldcupqatar22.composable.TopText

@Composable
fun WorldCupScreen() {
    ImageBackground()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopText(
            text = "T O D A Y",
            fontSize = 50.sp
        )
        TopText(
            text = "Group Matches",
            fontSize = 20.sp
        )
        TopText(
            text = "26 November . Monday",
            fontSize = 28.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
        MatchesCard(
            paddingVertical = 52.dp,
            teamOne = "England",
            time = "12:00",
            teamTwo = "Japan"
        )
        MatchesCard(
            teamOne = "Egypt",
            time = "15:00",
            teamTwo = "Iraq"
        )
        MatchesCard(
            paddingVertical = 52.dp,
            teamOne = "Saudi Arabia",
            time = "18:00",
            teamTwo = "Argentina"
        )
        MatchesCard(
            teamOne = "Qatar",
            time = "21:00",
            teamTwo = "USA"
        )
        ImageLogo()
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewWorldCupScreen() {
    WorldCupScreen()
}