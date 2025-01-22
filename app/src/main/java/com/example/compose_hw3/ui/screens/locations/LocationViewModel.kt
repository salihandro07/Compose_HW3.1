package com.example.compose_hw3.ui.screens.locations

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.compose_hw3.data.repository.LocationsRepository
import com.example.compose_hw3.data.dto.Location
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LocationViewModel(private val locationsRepository: LocationsRepository) : ViewModel() {

    private val _locationState = MutableStateFlow<List<Location>>(emptyList())
    val locationState: StateFlow<List<Location>> = _locationState.asStateFlow()

    init {
        fetchAllLocation()
    }
    private fun fetchAllLocation() {
        viewModelScope.launch {
            val location = locationsRepository.fetchAllLocations()
            if (location != null) {
                _locationState.value = location
            } else {
                Log.e("locationViewModel", "Failed to fetch locations")
            }
        }
    }
}