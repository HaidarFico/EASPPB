package com.example.etsppb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Place
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
fun BrowseShop(navController: NavHostController){
    Scaffold(bottomBar = { NavBar(navController = navController, currentIndex = 1 )}, topBar = { TopBar(title = "Produk Tersedia")}) {
        innerPadding -> Column (modifier = Modifier
        .padding(innerPadding)
        .fillMaxWidth()){
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(80.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
                .padding(5.dp, 5.dp)
        ) {
            Column {
                Text(text = "Food")
                Text(text = "Beras 100 gr Listen")
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Rp100.000,-")
                    Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "4.8")
                        Spacer(modifier = Modifier.width(3.dp))
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "Star Rating")
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(80.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
                .padding(5.dp, 5.dp)
        ) {
            Column {
                Text(text = "Snack")
                Text(text = "Oreo Original 1 pcs")
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Rp20.000,-")
                    Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "4.8")
                        Spacer(modifier = Modifier.width(3.dp))
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "Star Rating")
                    }
                }
            }
        }
    }
    }
}

@Composable
@Preview
fun BrowseShopPreview(){
    BrowseShop(navController = rememberNavController())
}