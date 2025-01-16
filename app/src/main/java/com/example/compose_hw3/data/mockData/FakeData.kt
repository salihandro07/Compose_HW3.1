package com.example.compose_hw3.data.mockData

import com.example.compose_hw3.data.models.Character
import com.example.compose_hw3.data.models.Episode
import com.example.compose_hw3.data.models.Gender
import com.example.compose_hw3.data.models.Location
import com.example.compose_hw3.data.models.Status

object FakeData {

    val dataCharacter = listOf<Character>(
        Character(
            id = 1,
            name = "Aiden Hunter",
            status = Status.Alive,
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
            gender = Gender.Male,
            location = "Earth"
        ),
        Character(
            id = 2,
            name = "Elara Moon",
            status = Status.Alive,
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUwsf55ekiYLReI4lwD8yydm5tw-djZjliEA&s",
            gender = Gender.Female,
            location = "Mars"
        ),
        Character(
            id = 3,
            name = "Zephyr Sky",
            status = Status.Dead,
            img = "https://www.woodtv.com/wp-content/uploads/sites/51/2020/10/keeler-township-john-doe-rendering-1987.jpg",
            gender = Gender.Male,
            location = "Galaxy Z"
        ),
        Character(
            id = 4,
            name = "Nova Starling",
            status = Status.Unknown,
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8MmeiifrOWyHJabOaut6UUCw-QyHWX7GNuK5BE5ky1rRxnYVh0IlmyadEiE9CQjeUdjQ&usqp=CAU",
            gender = Gender.Female,
            location = "Space Station Omega"
        ),
        Character(
            id = 5,
            name = "Kai the Adventurer",
            status = Status.Alive,
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbrJjZSFDRpSGa30u5aYm7-5u5abkJ8a7yoQ&s",
            gender = Gender.Male,
            location = "Unknown Planet X"
        ),
        Character(
            id = 6,
            name = "Seraphina Blaze",
            status = Status.Dead,
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbrJjZSFDRpSGa30u5aYm7-5u5abkJ8a7yoQ&s",
            gender = Gender.Female,
            location = "Ancient Ruins"
        ),
        Character(
            id = 7,
            name = "Orion Shadow",
            status = Status.Unknown,
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbrJjZSFDRpSGa30u5aYm7-5u5abkJ8a7yoQ&s",
            gender = Gender.Male,
            location = "Dark Nebula"
        )
    )

    val dataEpisode = listOf(
        Episode(
            id = 1,
            name = "The Rise of Aiden",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Episode(
            id = 2,
            name = "Elara's Journey to Mars",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Episode(
            id = 3,
            name = "The Final Battle of Zephyr",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Episode(
            id = 4,
            name = "Nova's Dark Secrets",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Episode(
            id = 5,
            name = "Kai's Ultimate Quest",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Episode(
            id = 6,
            name = "Seraphina's Legacy",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Episode(
            id = 7,
            name = "Orion's Escape",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Episode(
            id = 8,
            name = "The Final Countdown",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
    )

    val dataLocation = listOf(
        Location(
            id = 1,
            name = "The Forgotten Temple",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Location(
            id = 2,
            name = "Space Station Omega",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Location(
            id = 3,
            name = "Unknown Planet X",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Location(
            id = 4,
            name = "The Dark Nebula",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Location(
            id = 5,
            name = "The Crystal Caverns",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Location(
            id = 6,
            name = "The Astral Plane",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Location(
            id = 7,
            name = "The Floating City",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
        Location(
            id = 8,
            name = "The Abyssal Zone",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvl-3s27sN3QHbWiuRzijVHVJRcZevBK56VQ&s",
        ),
    )
}