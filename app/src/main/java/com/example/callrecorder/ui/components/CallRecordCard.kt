package com.example.callrecorder.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.example.callrecorder.R

@Composable
fun CallRecordCard(){
    Row(
        modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(10.dp)
                .clip(RoundedCornerShape(10.dp)),
        horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "13/05/2023" ,style = MaterialTheme.typography.bodyLarge)
        Text(text = "07:42 PM" ,style = MaterialTheme.typography.bodyLarge)
        Text(text = "00:00/02:26" ,style = MaterialTheme.typography.bodyLarge)
        Icon(painter = painterResource(R.drawable.play_circle_icn), contentDescription = "play or pause icon" )
//        Icon(painter = painterResource(R.drawable.pause_circle_icn), contentDescription = "play or pause icon" )
    }
}

@Composable
@Preview
fun CallRecordCardPreview(){
    CallRecordCard()
}