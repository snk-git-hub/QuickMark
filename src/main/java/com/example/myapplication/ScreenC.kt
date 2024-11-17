package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenC(navController: NavController) {
    var expanded by remember { mutableStateOf(false) }
    var selectedSemester by remember { mutableStateOf("Select Semester") }
    val semesters = (1..8).map { "Semester $it" }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded }
            ) {
                TextField(
                    value = selectedSemester,
                    onValueChange = {},
                    readOnly = true,
                    label = { Text("Semester") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor()
                        .clickable { expanded = !expanded },
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White, // Background color of the text field
                        focusedIndicatorColor = Color.Gray,
                        unfocusedIndicatorColor = Color.Gray
                    )
                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier.background(Color.White) // Background color of the dropdown menu
                ) {
                    semesters.forEach { semester ->
                        DropdownMenuItem(
                            text = { Text(semester, color = Color.Black) }, // Text color
                            onClick = {
                                selectedSemester = semester
                                expanded = false
                            },
                            modifier = Modifier.background(Color.White) // Background color for each menu item
                        )
                    }
                }
            }



            Button(
                onClick = {
                    onSubmit(navController)
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("NEXT")
            }
        }
    }
}
fun onSubmit(navController: NavController) {



    navController.navigate("screen_B")

}