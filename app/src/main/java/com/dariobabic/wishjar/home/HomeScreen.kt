package com.dariobabic.wishjar.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dariobabic.wishjar.navigation.NavigationDestination.CALENDAR
import com.dariobabic.wishjar.navigation.NavigationDestination.GALLERY
import com.dariobabic.wishjar.navigation.NavigationDestination.JOURNEYS
import com.dariobabic.wishjar.navigation.NavigationDestination.MESSAGES
import com.dariobabic.wishjar.navigation.NavigationDestination.WISH_JAR
import com.dariobabic.wishjar.ui.theme.WishJarTheme

@Composable
fun HomeScreen(navController: NavHostController) {
    val columnModifier = Modifier.fillMaxHeight()
    Column(columnModifier, verticalArrangement = Arrangement.SpaceAround) {
        val spaceModifier = Modifier.height(4.dp)
        val buttonModifier = Modifier.weight(1f)

        Spacer(modifier = spaceModifier)
        HomeButton(
            modifier = buttonModifier,
            navController,
            WISH_JAR,
            "Wish Jar",
            textOnStart = false
        )
        Spacer(modifier = spaceModifier)
        HomeButton(
            modifier = buttonModifier,
            navController,
            CALENDAR,
            "Calendar",
            textOnStart = true
        )
        Spacer(modifier = spaceModifier)
        HomeButton(
            modifier = buttonModifier,
            navController,
            GALLERY,
            "Gallery",
            textOnStart = false
        )
        Spacer(modifier = spaceModifier)
        HomeButton(modifier = buttonModifier, navController, "songs", "Songs", textOnStart = true)
        Spacer(modifier = spaceModifier)
        HomeButton(
            modifier = buttonModifier,
            navController,
            MESSAGES,
            "Messages",
            textOnStart = false
        )
        Spacer(modifier = spaceModifier)
        HomeButton(
            modifier = buttonModifier,
            navController,
            JOURNEYS,
            "Journeys",
            textOnStart = true
        )
        Spacer(modifier = spaceModifier)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenDefaultPreview() {
    WishJarTheme {
        val navController = rememberNavController()
        HomeScreen(navController)
    }
}