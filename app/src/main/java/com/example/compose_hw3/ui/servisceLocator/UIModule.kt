package com.example.compose_hw3.ui.servisceLocator

import com.example.compose_hw3.ui.screens.characters.CharacterViewModel
import com.example.compose_hw3.ui.screens.characters.detail.CharacterDetailViewModel
import com.example.compose_hw3.ui.screens.episodes.EpisodeViewModel
import com.example.compose_hw3.ui.screens.episodes.detail.EpisodesDetailViewModel
import com.example.compose_hw3.ui.screens.locations.detail.LocationsDetailViewModel
import com.example.rickmorty.ui.screens.locations.LocationViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module


val uiModule = module {
    viewModel { CharacterViewModel(get()) }
    viewModel { (characterId: Int) ->
        CharacterDetailViewModel(get(), characterId)
    }
    viewModel { EpisodeViewModel(get()) }
    viewModel { (episodeId: Int) ->
        EpisodesDetailViewModel(get(), episodeId)
    }

    viewModel { LocationViewModel(get()) }
    viewModel { (locationId: Int) ->
        LocationsDetailViewModel(get(), locationId)
    }
}