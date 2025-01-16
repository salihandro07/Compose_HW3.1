package com.example.compose_hw3.ui.screens

import androidx.compose.runtime.Composable
import com.example.compose_hw3.ui.screens.components.ItemCard
import com.example.compose_hw3.ui.screens.components.ItemList
import com.example.compose_hw3.data.mockData.FakeData
import com.example.compose_hw3.data.models.Character
@Composable
fun CharactersScreen(navigate: (Int) -> Unit) {
    ItemList(
        items = FakeData.dataCharacter,
        onItemClick = navigate,
        itemContent = { character, onItemClick ->
            CharacterItem(character as Character, onItemClick)
        }
    )
}
@Composable
fun CharacterItem(character: Character, navigate: (Int) -> Unit) {
    ItemCard(
        imageUrl = character.img,
        title = character.name,
        onItemClick = { navigate(character.id) }
    )
}
