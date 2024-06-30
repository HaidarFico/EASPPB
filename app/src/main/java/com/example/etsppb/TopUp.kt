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
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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

@Composable
fun TopUp(navController: NavHostController){
    Scaffold (bottomBar = { NavBar(navController = navController, currentIndex = 2)}, topBar = {
        TopBar(
        title = "Top Up"
    )
    }) {
        internalPadding ->
        Column (modifier = Modifier
            .padding(internalPadding)
            .fillMaxWidth()){
        Box(modifier = Modifier
            .width(360.dp)
            .height(140.dp)
            .align(Alignment.CenterHorizontally)
            .background(Color.LightGray)
            .padding(10.dp, 10.dp)) {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.gopay), contentDescription = "Airline Icon", modifier = Modifier.size(50.dp))
                Column(horizontalAlignment = Alignment.End) {
                    Text(text = "\$100")
                }
            }
            Box(modifier = Modifier.align(Alignment.BottomCenter)){
                Column() {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "TOP UP HERE")
                        }
                    }
                }
            }
        }
            Spacer(modifier = Modifier.height(15.dp))
            Box(modifier = Modifier
                .width(360.dp)
                .height(140.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color.LightGray)
                .padding(10.dp, 10.dp)) {
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(id = R.drawable.dana), contentDescription = "Airline Icon", modifier = Modifier.size(50.dp))
                    Column(horizontalAlignment = Alignment.End) {
                        Text(text = "\$200")
                    }
                }
                Box(modifier = Modifier.align(Alignment.BottomCenter)){
                    Column() {
                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
                            Button(onClick = { /*TODO*/ }) {
                                Text(text = "TOP UP HERE")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun TopUpPreview(){
    TopUp(navController = rememberNavController())
}