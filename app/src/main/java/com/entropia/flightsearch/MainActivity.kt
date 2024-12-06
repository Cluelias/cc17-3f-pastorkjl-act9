package com.entropia.flightsearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.entropia.flightsearch.ui.FlightSearchViewModel
import com.entropia.flightsearch.ui.HomeScreen
import com.entropia.flightsearch.ui.FlightSearchTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlightSearchTheme {

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(id = R.dimen.padding_small)),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val flightSearchViewModel: FlightSearchViewModel = viewModel(factory = FlightSearchViewModel.factory)

                    HomeScreen(viewModel = flightSearchViewModel)
                }
            }
        }
    }
}
