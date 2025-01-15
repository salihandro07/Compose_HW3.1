package com.example.compose_hw3.data

data class Character(val id: Int, val name: String, val status: String, val avatar: String)
data class Episode(val id: Int, val name: String, val airDate: String)
data class Location(val id: Int, val name: String, val type: String)

val MockCharacters = listOf(
    Character(1, "Rick Sanchez", "Alive", "https://example.com/rick.png"),
    Character(2, "Morty Smith", "Alive", "https://example.com/morty.png"),
    Character(3, "Birdperson", "Dead", "https://example.com/birdperson.png")
)



val MockLocations = listOf(
    Location(1, "Earth", "Planet"),
    Location(2, "Gazorpazorp", "Planet"),
    Location(3, "Bird World", "Planet")
)

val MockEpisodes = listOf(
    Episode(1, "Pilot", "December 2, 2013"),
    Episode(2, "Lawnmower Dog", "December 9, 2013"),
    Episode(3, "Anatomy Park", "December 16, 2013")
)
