package com.example.compose_hw3.ui


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.compose_hw3.data.MockLocations

@Composable
fun LocationsScreen(navController: NavController) {
    LazyColumn {
        items(MockLocations) { location ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Column {
                    Text(location.name)
                    Text("Type: ${location.type}")
                }
            }
        }
    }
}