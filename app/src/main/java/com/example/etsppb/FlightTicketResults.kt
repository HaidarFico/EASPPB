package com.example.etsppb

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun FlightTicketResults(navController: NavHostController) {
    Scaffold(bottomBar = { NavBar(navController = navController, currentIndex = null)}, topBar = { TopBar(title = "Available Flights")}) {
        internalPadding -> Column (modifier = Modifier.padding(internalPadding)){
            Text(text = "22 Jan 2024", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier
            .width(360.dp)
            .height(140.dp)
            .align(Alignment.CenterHorizontally)
            .background(Color.LightGray)
            .padding(10.dp, 10.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.garuda_indonesia), contentDescription = "Airline Icon", modifier = Modifier.size(50.dp))
                Column(horizontalAlignment = Alignment.End) {
                    Text(text = "\$100")
                    Text(text = "5 Left")
                }
            }
            Box(modifier = Modifier.align(Alignment.BottomCenter)){
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "Jakarta (CGK)")
                        Text(text = "Yogyakarta (KIA)")
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                        Text(text= "08:00 AM")
                        Icon(painter = painterResource(id = R.drawable.plane_icon), contentDescription = "Airline Icon")
                        Text(text = "09:15 AM")
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                        Text(text= "22 Jan 2024")
                        Text(text= "Duration 1h 15m")
                        Text(text= "22 Jan 2024")
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier
            .width(360.dp)
            .height(140.dp)
            .align(Alignment.CenterHorizontally)
            .background(Color.LightGray)
            .padding(10.dp, 10.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.air_asia), contentDescription = "Airline Icon", modifier = Modifier.size(40.dp))
                Column(horizontalAlignment = Alignment.End) {
                    Text(text = "\$100")
                    Text(text = "5 Left")
                }
            }
            Box(modifier = Modifier.align(Alignment.BottomCenter)){
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "Jakarta (CGK)")
                        Text(text = "Yogyakarta (KIA)")
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                        Text(text= "08:00 AM")
                        Icon(painter = painterResource(id = R.drawable.plane_icon), contentDescription = "Airline Icon")
                        Text(text = "09:15 AM")
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                        Text(text= "22 Jan 2024")
                        Text(text= "Duration 1h 15m")
                        Text(text= "22 Jan 2024")

                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier
            .width(360.dp)
            .height(140.dp)
            .align(Alignment.CenterHorizontally)
            .background(Color.LightGray)
            .padding(10.dp, 10.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.lion_air), contentDescription = "Airline Icon", modifier = Modifier.size(40.dp))
                Column(horizontalAlignment = Alignment.End) {
                    Text(text = "\$100")
                    Text(text = "5 Left")
                }
            }
            Box(modifier = Modifier.align(Alignment.BottomCenter)){
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                        Text(text = "Jakarta (CGK)")
                        Text(text = "Yogyakarta (KIA)")
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                        Text(text= "09:00 AM")
                        Icon(painter = painterResource(id = R.drawable.plane_icon), contentDescription = "Airline Icon")
                        Text(text = "10:15 AM")
                    }
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                        Text(text= "22 Jan 2024")
                        Text(text= "Duration 1h 15m")
                        Text(text= "22 Jan 2024")

                    }
                }
            }

        }
        }
    }
}

@Composable
@Preview
fun FlightTicketResultsPreview(){
    FlightTicketResults(navController = rememberNavController())
}