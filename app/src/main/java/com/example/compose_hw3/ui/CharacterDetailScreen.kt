package com.example.compose_hw3.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.compose_hw3.data.MockCharacters

@Composable
fun CharacterDetailScreen(navController: NavController, characterId: Int?) {
    val character = MockCharacters.find { it.id == characterId }

    character?.let {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = rememberImagePainter(data = it.avatar),
                contentDescription = null,
                modifier = Modifier.size(128.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text("Name: ${it.name}")
            Text("Status: ${it.status}")
            Text("Species: Human") // Replace with real data if available
            Text("Gender: Male") // Replace with real data if available
            Text("Location: Earth") // Replace with real data if available
        }
    }
}