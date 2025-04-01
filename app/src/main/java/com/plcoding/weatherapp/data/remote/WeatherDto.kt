package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly") //actual name from Api for this data is hourly, but we called it weatherData
    val weatherData: WeatherDataDto
)
