package com.example.compose_hw3.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.compose_hw3.data.MockCharacters

@Composable
fun CharactersScreen(navController: NavController) {
    LazyColumn {
        items(MockCharacters) { character ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navController.navigate("characterDetail/${character.id}") }
                    .padding(8.dp)
            ) {
                Image(
                    painter = rememberImagePainter(data = character.avatar),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(character.name)
                    Text(character.status)
                }
            }
        }
    }
}