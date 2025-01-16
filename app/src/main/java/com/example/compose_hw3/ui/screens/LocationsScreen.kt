package com.example.compose_hw3.ui.screens

import androidx.compose.runtime.Composable
import com.example.compose_hw3.ui.screens.components.ItemCard
import com.example.compose_hw3.ui.screens.components.ItemList
import com.example.compose_hw3.data.mockData.FakeData
import com.example.compose_hw3.data.models.Location

@Composable
fun LocationsScreen(navigate: (Int) -> Unit) {
    ItemList(
        items = FakeData.dataLocation,
        onItemClick = navigate,
        itemContent = { location, onItemClick ->
            LocationItem(location as Location, onItemClick)
        }
    )
}

@Composable
fun LocationItem(location: Location, navigate: (Int) -> Unit) {
    ItemCard(
        imageUrl = location.img,
        title = location.name,
        onItemClick = { navigate(location.id) }
    )
}