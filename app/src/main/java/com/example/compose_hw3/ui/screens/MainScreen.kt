package com.example.compose_hw3.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.compose_hw3.data.models.BottomNavItem
import com.example.compose_hw3.ui.navRoute.NavRoute
import com.example.compose_hw3.ui.screens.detail.CharacterDetailScreen
import com.example.compose_hw3.ui.screens.detail.EpisodeDetailScreen
import com.example.compose_hw3.ui.screens.detail.LocationDetailScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = currentBackStackEntry?.destination?.route

    val detailRoutes = listOf(
        NavRoute.CharacterDetail,
        NavRoute.EpisodesDetail,
        NavRoute.LocationDetail
    )

    val isNotDetail = currentDestination !in detailRoutes

    Scaffold(
        topBar = {
            if (isNotDetail) {
                CenterAlignedTopAppBar(
                    title = {
                        Text(
                            text = "Compose Navigation",
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                    },
                )
            }
        },

        bottomBar = {
            if (isNotDetail) {
                NavigationBar {
                    bottomNavListOf.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = currentDestination == bottomNavItem.route,
                            onClick = {
                                navController.navigate(bottomNavItem.route) {
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        }
                                    }
                                ) {
                                    Icon(
                                        imageVector = if (currentDestination == bottomNavItem.route)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title
                                    )
                                }
                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            }
                        )
                    }
                }
            }
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            NavHostInit(navController)
        }
    }
}

@Composable
fun NavHostInit(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Character
    ) {
        composable(NavRoute.Character) {
            CharactersScreen(
                navigate = {
                    navController.navigate(
                        "${NavRoute.CharacterDetail.replace("{id}", it.toString())}"
                    )
                }
            )
        }

        composable(NavRoute.CharacterDetail) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
            CharacterDetailScreen(id)
        }

        composable(NavRoute.Episodes) {
            EpisodesScreen(
                navigate = {
                    navController.navigate(
                        "${NavRoute.EpisodesDetail.replace("{id}", it.toString())}"
                    )
                }
            )
        }

        composable(NavRoute.EpisodesDetail) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
            EpisodeDetailScreen(id)
        }

        composable(NavRoute.Location) {
            LocationsScreen(
                navigate = {
                    navController.navigate(
                        "${NavRoute.LocationDetail.replace("{id}", it.toString())}"
                    )
                }
            )
        }

        composable(NavRoute.LocationDetail) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
            LocationDetailScreen(id)
        }
    }
}


val bottomNavListOf = listOf(
    BottomNavItem(
        title = "Character",
        route = NavRoute.Character,
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        badges = 1
    ),
    BottomNavItem(
        title = "Episodes",
        route = NavRoute.Episodes,
        selectedIcon = Icons.Filled.PlayArrow,
        unselectedIcon = Icons.Outlined.PlayArrow,
        badges = 3
    ),
    BottomNavItem(
        title = "Location",
        route = NavRoute.Location,
        selectedIcon = Icons.Filled.LocationOn,
        unselectedIcon = Icons.Outlined.LocationOn,
        badges = 3
    )
)