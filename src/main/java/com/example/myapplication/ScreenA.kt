package com.example.myapplication
import android.opengl.ETC1.isValid
import androidx.navigation.NavController

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun ScreenA (navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column {
            Text(
                text = "QUICK MARK",
                fontSize = 80.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
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
            SimpleInputField(navController = navController)

        }
    }
@Composable
fun SimpleInputField(navController: NavController) {
        var text by remember { mutableStateOf("")}
        var isValid by remember { mutableStateOf(true)}
        var showDialog by remember { mutableStateOf(false) }
        val usnRegex = "^[0-9]{2}[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{3}$".toRegex()


    fun validateUSN(input: String): Boolean {
        return input.matches(usnRegex)
    }

    fun onSubmit() {
        isValid = validateUSN(text)
        showDialog = !isValid

        if (isValid) {


            navController.navigate("screen_C")
        }
    }

    TextField(
        value = text,
        onValueChange = { newText ->
            text = newText

        },
        label = { Text("ENTER YOUR USN") },
        placeholder = { Text("ENTER YOUR USN") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        singleLine = true
    )

    Button(
        onClick = {
            onSubmit()
        },
        modifier = Modifier.padding(top = 16.dp)
    ) {
        Text("NEXT")
    }

    if (showDialog) {
        InvalidUSNDialog(onDismiss = { showDialog = false })
        }
     }
@Composable
fun InvalidUSNDialog(onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Invalid USN") },
        text = { Text("The USN format is incorrect. Please enter a valid USN.") },
        confirmButton = {
            Button(onClick = onDismiss) {
                Text("OK")
            }
        },
        modifier = Modifier.padding(16.dp)
    )
}

