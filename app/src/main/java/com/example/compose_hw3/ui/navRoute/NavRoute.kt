package com.example.compose_hw3.ui.navRoute

import kotlinx.serialization.Serializable

object NavRoute {
    @Serializable
    const val Character = "character"
    @Serializable
    const val CharacterDetail = "character/{id}"
    @Serializable
    const val Episodes = "episodes"
    @Serializable
    const val EpisodesDetail = "episodes/{id}"
    @Serializable
    const val Location = "location"
    @Serializable
    const val LocationDetail = "location/{id}"
}