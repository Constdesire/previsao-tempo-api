package com.example.controller.dto.response;

public record TemperaturaResponse(
        String dataHora,
        Double temperaturaDia,
        String unidadeTemperaturaDia,
        Double vento,
        String unidade_Vento
) {
}