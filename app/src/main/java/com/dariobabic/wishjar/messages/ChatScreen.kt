package com.dariobabic.wishjar.messages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun ChatScreen(navController: NavHostController) {
    Spacer(modifier = Modifier
        .width(200.dp)
        .height(200.dp)
        .background(Color.Cyan))
}

@Preview
@Composable
fun ChatScreenPreview() {
    val navController = rememberNavController()
    ChatScreen(navController = navController)
}