package com.example.compose_hw3.ui.screens.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.compose_hw3.data.mockData.FakeData

@Composable
fun CharacterDetailScreen(id:Int){
    val character= FakeData.dataCharacter.find { it.id == id }
    if (character != null){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = character.img,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = character.name,
                textAlign = TextAlign.Center,
                fontSize = 32.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = character.status.name,
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Text(
                text = "Location: "+character.location,
                fontSize = 18.sp,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "ID: "+character.id.toString(),
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(

                text = "Gender: "+character.gender.name,
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }else{
        Text(
            text = "404 error character not found ",
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontStyle = FontStyle.Normal,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}