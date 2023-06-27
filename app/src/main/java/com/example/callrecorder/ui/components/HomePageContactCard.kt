package com.example.callrecorder.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.callrecorder.R

@Composable
fun HomePageContactCard(name : String, mobileNumber : String, navController: NavHostController){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFFCCFFAA))
            .clickable {
                navController.navigate("addContactPage")
            },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Row(modifier= Modifier
            .fillMaxWidth(0.8f)
            .padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically) {

            CircleProfile()

            Column(modifier = Modifier.height(50.dp),verticalArrangement = Arrangement.SpaceEvenly) {
                Text(text= name , style = MaterialTheme.typography.bodyLarge)
                Text(text= mobileNumber)
            }
        }
        Row(Modifier.padding(10.dp,0.dp)) {
            Icon(painter = painterResource(R.drawable.forward_icon), contentDescription = "Forward Icon" )
        }
    }
    Spacer(modifier = Modifier.padding(10.dp))
}

@Composable
fun CircleProfile(){
    Row (
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(Color(0xFF9CCC65)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
    ){
        Text(text="MD")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    HomePageContactCard("Pallabi Saha","+91 9163567268", navController = rememberNavController())
}