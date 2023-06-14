package com.example.weatherui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(padding: PaddingValues){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(paddingValues = padding)) {
        DateText(date = "Friday 20 January")
        Text(text = "Sunny", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Text(text = "31", fontSize = 65.sp)
        Text(text = "Daily Summary", fontWeight = FontWeight.Black, fontSize = 20.sp)
        Text(text = "Now it feels like +25, infact + 28, it feels hot because of the heavy rain. Today The temperature is felt in the range from +22 to+ 28", Modifier.padding(10.dp), fontSize = 16.sp)
        WeatherDetails()
    }
}
