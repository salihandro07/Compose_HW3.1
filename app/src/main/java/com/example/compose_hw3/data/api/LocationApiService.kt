package com.example.compose_hw3.data.api

import com.example.compose_hw3.data.dto.Location
import com.example.compose_hw3.data.dto.LocationsResultResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface LocationApiService {
    @GET("location")
    suspend fun fetchAllLocations(): Response<LocationsResultResponse>
    @GET("location/{id}")
    suspend fun fetchLocationsByID(@Path("id") id: Int): Response<Location>
}