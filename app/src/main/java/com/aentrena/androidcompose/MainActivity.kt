package com.aentrena.androidcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.aentrena.androidcompose.ui.theme.components.AndroidComposeTheme
import com.aentrena.androidcompose.ui.theme.components.HoustonScreen
import com.aentrena.androidcompose.ui.theme.herolist.HeroListScreen
import com.aentrena.androidcompose.ui.theme.herolist.HeroListState
import com.aentrena.androidcompose.ui.theme.herolist.HeroListViewModel
import com.aentrena.androidcompose.ui.theme.herolist.generateHeros
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val heroListViewModel: HeroListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidComposeTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "screen1"){
                        composable("screen1"){
                            Screen1(navController)
                        }
                        composable("screen2"){
                            Screen2{
                                navController.navigate("screen3")
                            }
                        }

                        composable("screen3"){
                            Screen3{
                                navController.navigate("screen4")
                            }
                        }

                        composable("screen4",
                            arguments = listOf(
                            navArgument("devName"){
                                this.type = NavType.StringType
                                nullable = false
                                defaultValue = "Alvaro"
                            }
                        )
                        ){
                            val devName = it.arguments?.getString("devName").orEmpty()
                            Screen4(devName)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Screen1(navController: NavController) {
    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color.Red)
        .clickable {
            navController.navigate("screen2")
        }) {
    }
}

@Composable
fun Screen2(onClick: () -> Unit) {
    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color.Blue)
        .clickable {
            onClick()
        }
    ) {

    }
}

@Composable
fun Screen3(onClick: () -> Unit) {
    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color.Green)
        .clickable {
            onClick()
        }
    ) {

    }
}

@Composable
fun Screen4(name: String) {
    Box(modifier= Modifier
        .fillMaxSize()
        .background(Color.Yellow)
    ) {
        Text(text = name, fontSize = 30.sp)
    }
}

@Preview
@Composable
private fun Screen2_Preview() {
    Screen2 {

    }
}


@Composable
private fun MainScreen(heroListViewModel: HeroListViewModel) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        val state by heroListViewModel.state.collectAsState()
        when(state){
            is HeroListState.Success -> {

            }

            is HeroListState.Error -> TODO()
            HeroListState.Loading -> TODO()
        }
        HeroListScreen(heros = (state as HeroListState.Success).heros, modifier = Modifier.padding(it))
    }
}