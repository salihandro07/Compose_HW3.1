package com.example.compose_hw3.data.repository

import com.example.compose_hw3.data.api.EpisodesApiService
import com.example.compose_hw3.data.dto.Episode

class EpisodesRepository(private val apiService: EpisodesApiService) {
    suspend fun fetchAllEpisodes(): List<Episode> {
        return if (apiService.fetchAllEpisodes().isSuccessful) {
            apiService.fetchAllEpisodes().body()?.episodesResponseList
        } else {
            emptyList()
        }
    }

    suspend fun fetchEpisodesById(id: Int):Episode?{
        return if(apiService.fetchEpisodesByID(id).isSuccessful)
            apiService.fetchEpisodesByID(id).body()
        else
            null
    }
}