package com.dariobabic.wishjar.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dariobabic.wishjar.utils.Circle

@Composable
fun HomeButton(
    modifier: Modifier,
    navController: NavHostController,
    destination: String,
    text: String,
    textOnStart: Boolean
) {
    val buttonModifier = modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(horizontal = 4.dp)

    val textAlignment = if (textOnStart) Alignment.BottomStart else Alignment.BottomEnd
    val badgeAlignment = if (textOnStart) Alignment.TopStart else Alignment.TopEnd
    val imageAlignment = if (textOnStart) Alignment.BottomEnd else Alignment.BottomStart

    Button(modifier = buttonModifier,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        onClick = { navController.navigate(destination) }) {
        Box(
            Modifier
                .fillMaxSize()
                .align(alignment = Alignment.CenterVertically)
        ) {
            Circle(
                modifier = Modifier
                    .align(badgeAlignment)
                    .padding(10.dp)
            )
            Text(
                text = text,
                style = TextStyle(fontSize = 20.sp),
                color = Color.Black,
                modifier = Modifier
                    .align(textAlignment)
                    .padding(10.dp)
            )
        }
    }
}


@Preview
@Composable
fun HomeButtonTextOnLeftPreview() {
    val modifier = Modifier.height(150.dp)
    val navController = rememberNavController()
    HomeButton(modifier = modifier, navController, "Destination", "First Button", true)
}

@Preview
@Composable
fun HomeButtonTextOnRightPreview() {
    val modifier = Modifier.height(150.dp)
    val navController = rememberNavController()
    HomeButton(modifier = modifier, navController, "Destination", "Second Button", false)
}