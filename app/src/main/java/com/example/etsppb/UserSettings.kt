package com.example.etsppb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun UserSettings(navController: NavHostController) {
    Scaffold(bottomBar = { NavBar(navController, 3) }, topBar = { TopBar(title = "Settings")}) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxWidth()) {
                Column(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .width(360.dp)
                            .height(140.dp)
                            .background(Color.LightGray)
                            .align(Alignment.CenterHorizontally)
                            .padding(10.dp)
                    ) {
                        Column {
                            Text(text = "Edit Detail Akun")
                            Spacer(modifier = Modifier.height(10.dp))
                            Row(modifier = Modifier.fillMaxWidth()){
                                Row(horizontalArrangement = Arrangement.End, modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
                                    Icon(imageVector = Icons.Filled.Star, contentDescription = "Star Rating")
                                    Spacer(modifier = Modifier.width(3.dp))
                                    Text(text = "Verified Member")
                                }
                            }
                        }
                }
                    Box() {
                        Text(text = "Metode Pembayaran")
                    }
                    Box() {
                        Column {
                            Text(text = "Mastercard")
                            Text(text = "3992028394")
                        }
                    }
                    Box() {
                        Column {
                            Text(text = "Gopay")
                            Text(text = "3992028394")
                        }
                    }
                    Box() {
                        Column {
                            Text(text = "OVO")
                            Text(text = "3992028394")
                        }
                    }
                    Box() {
                        Column {
                            Text(text = "VISA")
                            Text(text = "3992028394")
                        }
                    }
                    Box(
                        modifier = Modifier
                            .width(140.dp)
                            .height(40.dp)
                            .background(Color.LightGray)
                            .align(Alignment.CenterHorizontally)
                        , contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Ubah Password")
                    }
                    Box(
                        modifier = Modifier
                            .width(140.dp)
                            .height(40.dp)
                            .background(Color.LightGray)
                            .align(Alignment.CenterHorizontally)
                        , contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Ubah Warna")
                    }
            }
        }
    }
}

@Composable
@Preview
fun UserSettingsPreview() {
    UserSettings(navController = rememberNavController())
}