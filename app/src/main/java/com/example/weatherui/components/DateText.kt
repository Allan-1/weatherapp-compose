package com.example.weatherui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DateText(date: String){
    Surface(modifier = Modifier.padding(8.dp),
        color = MaterialTheme.colorScheme.primary,
        shape = RoundedCornerShape(24.dp)) {
        Text(text = date, Modifier.padding(8.dp))
    }
}