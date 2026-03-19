package com.example.entity;

public record PrevisaoTempo(
        String id,
        Double latitude,
        Double longitude,
        String tempoZona,
        String dataHora,
        Double temperaturaDia,
        String unidadeTemperaturaDia,
        Double vento,
        String unidadeVento
) {
}