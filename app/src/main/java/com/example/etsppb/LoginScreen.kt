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
fun LoginScreen(navController: NavHostController){
//    Box(modifier = Modifier.fillMaxSize()) {
//        Image(painter = painterResource(id = R.drawable.rektorat), contentDescription = "rektorat_background", contentScale = ContentScale.FillBounds, modifier = Modifier.matchParentSize())
//    }
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
            Text(text = "Login")
        }
        ClickableText(text = AnnotatedString("Don't have an account? Click Here!"), onClick = {navController.navigate(route=Screen.RegisterScreen.route)})
    }
}