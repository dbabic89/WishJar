package com.dariobabic.wishjar.journeys

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun JourneysScreen(navController: NavHostController) {
    val journeys = getJourneys()
    val buttonModifier = Modifier
        .fillMaxWidth()
        .height(130.dp)
        .padding(horizontal = 4.dp)

    Column() {
        journeys.forEach {
            Spacer(modifier = Modifier.height(4.dp))
            Button(
                modifier = buttonModifier,
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                onClick = {}
            ) {
                Box() {
                    Text(text = it.title)
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun JourneysScreenPreview() {
    val navController = rememberNavController()
    JourneysScreen(navController)
}