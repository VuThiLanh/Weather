package com.lanh.weather.data.repository

import com.lanh.weather.model.Weather
import com.lanh.weather.utils.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>
}