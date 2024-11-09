package com.example.myapplication

import android.R.attr.progress
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenB (){


    Box(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {

        LazyColumn {
            itemsIndexed(
                listOf(
                    "DATA STRUCTURE" to 0.9f,
                    "COMPUTER NETWORK" to 0.8f,
                    "SYSTEM DESIGN" to 0.7f,
                    "DATA BASE" to 0.6f,
                    "DATA STRUCTURE" to 0.5f,
                    "COMPUTER NETWORK" to 0.9f,
                    "SYSTEM DESIGN" to 0.85f,
                    "DATA BASE" to 0.95f
                )
            ) { index, (title,progress) ->
                Column {
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFF0C2329)),
                        modifier = Modifier
                            .size(width = 440.dp, height = 150.dp)
                            .padding(vertical = 10.dp)
                            .padding(horizontal = 8.dp)
                    ) {

                        Column (modifier = Modifier.padding(16.dp)){
                            Text(
                                color = White,
                                text = title,
                                fontSize = 24.sp,

                                textAlign = TextAlign.Left,
                                modifier = Modifier


                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "${(progress * 100).toInt()}%",
                                color = Color(0xFF00FF00),
                                fontSize = 16.sp,
                                textAlign = TextAlign.Left,
                                modifier = Modifier

                            )
                            Spacer(modifier = Modifier.height(8.dp))

                            LinearProgressIndicator(
                                progress = progress,
                                color = Color(0xFF00FF00),
                                trackColor = Color.Gray,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 10.dp)
                                    .height(6.dp)
                            )
                        }
                    }
                }

            }
        }
     }
}
