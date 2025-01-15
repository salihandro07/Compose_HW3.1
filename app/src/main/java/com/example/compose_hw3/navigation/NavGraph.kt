package com.example.compose_hw3.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.compose_hw3.ui.CharacterDetailScreen
import com.example.compose_hw3.ui.CharactersScreen
import com.example.compose_hw3.ui.EpisodesScreen
import com.example.compose_hw3.ui.LocationsScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "characters") {
        composable("characters") { CharactersScreen(navController) }
        composable("locations") { LocationsScreen(navController) }
        composable("episodes") { EpisodesScreen(navController) }
        composable(
            "characterDetail/{characterId}",
            arguments = listOf(navArgument("characterId") { type = NavType.IntType })
        ) { backStackEntry ->
            val characterId = backStackEntry.arguments?.getInt("characterId")
            CharacterDetailScreen(navController, characterId)
        }
    }
}