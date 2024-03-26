package com.lanh.weather.data.network

import com.lanh.weather.BuildConfig
import com.lanh.weather.data.model.ForecastResponse
import com.lanh.weather.utils.DEFAULT_WEATHER_DESTINATION
import com.lanh.weather.utils.NUMBER_OF_DAYS
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("key") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
        @Query("days") days: Int = NUMBER_OF_DAYS,
    ): ForecastResponse
}