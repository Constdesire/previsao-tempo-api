package com.example.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record OpenMeteoResponse(
        String timezone,
        @JsonProperty("current_weather") CurrentWeather currentWeather,
        @JsonProperty("current_weather_units") CurrentWeatherUnits currentWeatherUnits
) {}
