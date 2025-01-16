package com.example.compose_hw3.data.models

data class Character(
    val id: Int,
    val name: String,
    val status: Status,
    val img: String,
    val gender: Gender,
    val location:String
)