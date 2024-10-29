package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenA (navController: NavController) {
    Box (


        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)


    ){
        Column {
            Text(

                text = "QUICK MARK",
                fontSize = 80.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign= TextAlign.Center,
                modifier= Modifier
                    .fillMaxWidth()
                    .offset(y = 90.dp)

                )
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = {

  navController.navigate("screen_B")
        },

            colors= ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
        )
        ) {

            Row (verticalAlignment= Alignment.CenterVertically){
                Image(
                    painter = painterResource(id=R.drawable.google_png),
                    contentDescription = "Google",
                    modifier = Modifier
                        .size(width = 40.dp, height = 40.dp)
                        .offset(x = (-8).dp)
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

