package com.lanh.weather.ui.weather

import com.lanh.weather.model.Weather

data class WeatherUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)
