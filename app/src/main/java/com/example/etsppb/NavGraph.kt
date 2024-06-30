package com.example.etsppb

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
     NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {
         composable(route = Screen.LoginScreen.route){ LoginScreen(navController = navController)}
         composable(route = Screen.RegisterScreen.route){ RegisterScreen(navController = navController) }
         composable(
             route = Screen.HomePage.route
         ){
             HomePage(navController)
         }
         composable(
             route = Screen.UserSettings.route
         ){
             UserSettings(navController)
         }
         composable(
             route = Screen.BrowseShop.route
         ) {
             BrowseShop(navController = navController)
         }
         composable(
             route = Screen.PreviousOrders.route
         ) {
             TopUp(navController = navController)
         }
         composable(
             route = Screen.FlightTicketResults.route
         ){
             FlightTicketResults(navController = navController)
         }
     }
}