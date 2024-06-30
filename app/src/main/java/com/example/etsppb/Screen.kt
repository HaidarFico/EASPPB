package com.example.etsppb

sealed class Screen(val route: String) {
    object HomePage: Screen(route = "home_page_screen")
    object UserSettings: Screen(route = "user_settings_screen")
    object BrowseShop: Screen(route = "browse_shop")
    object PreviousOrders: Screen(route = "previous_orders_screen")
    object FlightTicketResults: Screen(route = "flight_ticket_results_screen")
    object LoginScreen: Screen(route = "login_screen")
    object RegisterScreen: Screen(route = "register_screen")

}