package com.example.callrecorder.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ContactAddPage(navController: NavController) {

    var name by remember {
        mutableStateOf("")
    }
    var mobileNumber by remember {
        mutableStateOf("")
    }

    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(0.dp, 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        OutlinedTextField(
                value = name,
                onValueChange = { newText ->
                    name = newText
                },
                label = { Text(text = "Enter the name") }
        )
        OutlinedTextField(
                value = mobileNumber,
                onValueChange = {
                    name = it
                },
                label = { Text(text = "Enter the mobile number") }
        )
        Button(onClick = {
            navController.navigate("profilePage")
        }) {
            Text(text = "Save Contact")
        }
    }

}

@Composable
@Preview
fun ContactAddPagePreview() {
    ContactAddPage(navController = rememberNavController())
}