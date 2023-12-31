package com.example.callrecorder.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.callrecorder.R

@Composable
fun HomePageContactCard(name : String, mobileNumber : String){

//    val fontName = GoogleFont("Nunito")

//    val provider = GoogleFont.Provider(
//        providerAuthority = "com.google.android.gms.fonts",
//        providerPackage = "com.google.android.gms",
//        certificates = R.array.com_google_android_gms_fonts_certs
//    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFF556C65)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Row(modifier= Modifier
            .fillMaxWidth(0.8f)
            .padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically) {

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

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    HomePageContactCard("Pallabi Saha","+91 9163567268")
}