package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenB (){



        LazyColumn {
            itemsIndexed(
                listOf(
                    "DATA STRUCTURE",
                    "COMPUTER NETWORK",
                    "SYSTEM DESIGN",
                    "DATA BASE",
                    "DATA STRUCTURE",
                    "COMPUTER NETWORK",
                    "SYSTEM DESIGN",
                    "DATA BASE",
                    "DATA STRUCTURE",
                    "COMPUTER NETWORK",
                    "SYSTEM DESIGN",
                    "DATA BASE",
                    "DATA STRUCTURE",
                    "COMPUTER NETWORK",
                    "SYSTEM DESIGN",
                    "DATA BASE",
                    "DATA STRUCTURE",
                    "COMPUTER NETWORK",
                    "SYSTEM DESIGN",
                    "DATA BASE",
                    "DATA STRUCTURE",
                    "COMPUTER NETWORK",
                    "SYSTEM DESIGN",
                    "DATA BASE"
                )
            ) { index, string ->
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    ),
                    modifier = Modifier
                        .size(width = 440.dp, height = 150.dp)
                        .padding(vertical = 10.dp)
                        .padding(horizontal = 8.dp)
                ) {

                    Text(
                        text = string,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(vertical = 24.dp),
                    )


                }

            }
        }
    }
