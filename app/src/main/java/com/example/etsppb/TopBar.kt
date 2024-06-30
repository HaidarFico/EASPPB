package com.example.etsppb

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String) {
    TopAppBar(title = {
        Text(text = title, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
    })
}

@Composable
@Preview
fun TopBarPreview(){
    TopBar("Temp")
}