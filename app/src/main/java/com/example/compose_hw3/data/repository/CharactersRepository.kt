package com.example.compose_hw3.data.repository

import com.example.compose_hw3.data.api.CharactersApiService

class CharactersRepository(private val apiService : CharactersApiService) {
   suspend fun fetchAllCharacters():List<Char>? {
        return if(apiService.fetchAllCharacters().isSuccessful){
            apiService.fetchAllCharacters().body()?.charactersResponseList
        }else{
            emptyList()
        }
    }

    suspend fun fetchCharacterById(id: Int): Char? {
        val response = apiService.fetchCharacterByID(id)
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}