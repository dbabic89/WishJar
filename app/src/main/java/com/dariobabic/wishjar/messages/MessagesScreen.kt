package com.dariobabic.wishjar.messages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MessagesScreen(navController: NavHostController) {
    val messages = getMessages()
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom
    ) {
        messages.forEach {
            val textAlignment = if (it.isFromMe) Alignment.End else Alignment.Start

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.Cyan)
                    .align(textAlignment)
            ) {
                Text(
                    text = it.text, modifier = Modifier
                        .padding(10.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MessagesScreenPreview() {
    val navController = rememberNavController()
    MessagesScreen(navController = navController)
}