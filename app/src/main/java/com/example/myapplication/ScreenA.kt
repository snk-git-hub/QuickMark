package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenA (navController: NavController) {
    Column {
        Text(
            text = "ATTENDANCE",
            fontSize = 30.sp,


        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(onClick = {
  navController.navigate("screen_B")
        }) {
            Row (verticalAlignment= Alignment.CenterVertically){
                Image(
                    painter = painterResource(id=R.drawable.google_png),
                    contentDescription = "Google",
                    modifier = Modifier.size(width = 40.dp, height=40.dp)
                )
                Spacer(modifier = Modifier.size(24.dp))
                Text(
                    text = "Sign in With Google",
                    fontSize = 20.sp
                    )
                }
            }
        }
    }

