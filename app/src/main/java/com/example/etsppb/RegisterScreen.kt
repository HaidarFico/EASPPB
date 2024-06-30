package com.example.etsppb
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.navigation.NavHostController

@Composable
fun RegisterScreen(navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Email")
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email")
        })
        Text(text = "Password")
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })
        Button(onClick = { navController.navigate(route = Screen.HomePage.route) }) {
            Text(text = "Register")
        }
        ClickableText(text = AnnotatedString("Already have account? Click Here!"), onClick = {navController.navigate(route=Screen.LoginScreen.route)})
    }
}