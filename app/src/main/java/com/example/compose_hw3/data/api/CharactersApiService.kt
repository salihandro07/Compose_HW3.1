package com.example.compose_hw3.data.api

import com.example.compose_hw3.data.dto.CharactersResultResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharactersApiService {
    @GET("character")
    suspend fun fetchAllCharacters(): Response<CharactersResultResponse>

    @GET("character/{id}")
    suspend fun fetchCharacterByID(@Path("id") id: Int): Response<Char>
}