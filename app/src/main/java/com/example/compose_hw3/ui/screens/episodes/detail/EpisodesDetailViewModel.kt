package com.example.compose_hw3.ui.screens.episodes.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.compose_hw3.data.dto.Episode
import com.example.compose_hw3.data.repository.EpisodesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class EpisodesDetailViewModel(
    private val episodesRepository: EpisodesRepository,
    private val episodeId: Int
):ViewModel() {
    private val _episodeState = MutableStateFlow<Episode?>(null)
    val episodeState = _episodeState.asStateFlow()

    init {
        fetchEpisodeById()
    }

    private fun fetchEpisodeById() {
        viewModelScope.launch {
            val episode = episodesRepository.fetchEpisodesById(episodeId)
            if (episode!=null){
                _episodeState.value = episode
            }
        }
    }
}