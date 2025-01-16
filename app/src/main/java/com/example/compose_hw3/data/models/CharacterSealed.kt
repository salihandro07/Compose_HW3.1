package com.example.compose_hw3.data.models

sealed class Status(val name : String) {
    data object Dead : Status("Dead")
    data object Alive :Status("Alive")
    data object Unknown :Status("Unknown")
}
sealed class Gender(val name: String) {
    data object Male : Gender("Male")
    data object Female :Gender("Female")
}