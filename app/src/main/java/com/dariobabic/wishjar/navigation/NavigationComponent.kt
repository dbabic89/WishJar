package com.dariobabic.wishjar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dariobabic.wishjar.calendar.CalendarScreen
import com.dariobabic.wishjar.gallery.GalleryScreen
import com.dariobabic.wishjar.home.HomeScreen
import com.dariobabic.wishjar.journeys.JourneysScreen
import com.dariobabic.wishjar.messages.ChatScreen
import com.dariobabic.wishjar.messages.MessagesScreen
import com.dariobabic.wishjar.navigation.NavigationDestination.CALENDAR
import com.dariobabic.wishjar.navigation.NavigationDestination.CHAT
import com.dariobabic.wishjar.navigation.NavigationDestination.GALLERY
import com.dariobabic.wishjar.navigation.NavigationDestination.HOME
import com.dariobabic.wishjar.navigation.NavigationDestination.JOURNEYS
import com.dariobabic.wishjar.navigation.NavigationDestination.MESSAGES
import com.dariobabic.wishjar.navigation.NavigationDestination.SONGS
import com.dariobabic.wishjar.navigation.NavigationDestination.WISH_JAR
import com.dariobabic.wishjar.songs.SongsScreen
import com.dariobabic.wishjar.wishjar.WishJarScreen

@Composable
fun NavigationComponent(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {

        composable(HOME) { HomeScreen(navController) }
        composable(WISH_JAR) { WishJarScreen(navController) }
        composable(CALENDAR) { CalendarScreen(navController) }
        composable(GALLERY) { GalleryScreen(navController) }
        composable(SONGS) { SongsScreen(navController) }
        composable(MESSAGES) { MessagesScreen(navController) }
        composable(CHAT) { ChatScreen(navController) }
        composable(JOURNEYS) { JourneysScreen(navController) }
    }
}