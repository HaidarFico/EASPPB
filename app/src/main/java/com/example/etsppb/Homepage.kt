package com.example.etsppb

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(navController: NavHostController){
    Scaffold(bottomBar = { NavBar(navController, 0) }, topBar = { TopBar(title = "Home")})
    {
            innerPadding-> Column(modifier= Modifier.padding(innerPadding), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        SearchBar(
            query = "",
            onQueryChange = {},
            onSearch = {},
            onActiveChange = {},
            active = false,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Search Products")
            Image(imageVector = Icons.Filled.Search, contentDescription = "Search icon", modifier = Modifier)
        }
        Box(modifier = Modifier
            .width(360.dp)
            .height(140.dp)
            .align(Alignment.CenterHorizontally)
            .background(Color.LightGray)
            .padding(10.dp, 10.dp)) {
            Box(){
                Text(text = "Hello, Haidar Fico")
            }
            Box(modifier = Modifier.align(Alignment.BottomCenter)){
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "My Points")

                        Text(text = "My Balance")
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                        Text(text= "\$5")
                        Text(text = "Connect Now!")
                    }
                }
            }
        }
    }
    }
}

@Composable
@Preview
fun HomePagePreview(){
    HomePage(navController = rememberNavController())
}