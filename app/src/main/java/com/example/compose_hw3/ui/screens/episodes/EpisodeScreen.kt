package com.example.compose_hw3.ui.screens.episodes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.compose_hw3.data.dto.Episode
import com.example.compose_hw3.ui.screens.components.ItemCard
import com.example.compose_hw3.ui.screens.components.ItemList
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun EpisodeScreen(
    navigate: (Int) -> Unit,
    episodeViewModel: EpisodeViewModel = koinViewModel<EpisodeViewModel>()
) {
    val episodesState by episodeViewModel.episodesState.collectAsState()
    ItemList(items = episodesState,
        onItemClick = navigate,
        itemContent = { episode, onItemClick ->
            EpisodeItem(
                episode = episode as Episode,
                navigate = onItemClick
            )
        }
    )
}

@Composable
fun EpisodeItem(episode: Episode, navigate: (Int) -> Unit) {
    ItemCard(
        onItemClick = {
            navigate(episode.id)
        },
        title = episode.name,
        imageUrl = null.toString()
    )
}