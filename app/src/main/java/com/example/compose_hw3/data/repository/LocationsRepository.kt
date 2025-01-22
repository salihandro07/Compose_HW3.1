package com.example.compose_hw3.data.repository

import com.example.compose_hw3.data.api.LocationApiService
import com.example.compose_hw3.data.dto.Location

class LocationsRepository(private val apiService : LocationApiService) {
   suspend fun fetchAllLocations(): List<Location>? {
        return if(apiService.fetchAllLocations().isSuccessful){
            apiService.fetchAllLocations().body()?.locationResponseList
        }else{
            emptyList()
        }
    }

    suspend fun fetchLocationById(id: Int): Location? {
        val response = apiService.fetchLocationsByID(id)
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}