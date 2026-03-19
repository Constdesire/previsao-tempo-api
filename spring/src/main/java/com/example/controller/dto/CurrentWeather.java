package com.example.controller.dto;

public record CurrentWeather(
        String time,
        Double temperature,
        Double windspeed
) {}
