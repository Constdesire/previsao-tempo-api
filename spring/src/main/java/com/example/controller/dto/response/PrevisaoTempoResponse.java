package com.example.controller.dto.response;

public record PrevisaoTempoResponse(
        String tempo_zona,
        TemperaturaResponse Temperatura
) {
}