package com.example.compose_hw3.ui.screens

import androidx.compose.runtime.Composable
import com.example.compose_hw3.ui.screens.components.ItemCard
import com.example.compose_hw3.ui.screens.components.ItemList
import com.example.compose_hw3.data.mockData.FakeData
import com.example.compose_hw3.data.models.Episode

@Composable
fun EpisodesScreen(navigate: (Int) -> Unit) {
    ItemList(
        items = FakeData.dataEpisode,
        onItemClick = navigate,
        itemContent = { episode, onItemClick ->
            EpisodeItem(episode as Episode, onItemClick)
        }
    )
}
@Composable
fun EpisodeItem(episode: Episode, navigate: (Int) -> Unit) {
    ItemCard(
        imageUrl = episode.img,
        title = episode.name,
        onItemClick = { navigate(episode.id) }
    )
}