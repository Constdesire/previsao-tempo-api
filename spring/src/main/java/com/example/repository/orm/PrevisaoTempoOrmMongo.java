package com.example.repository.orm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "previsao_tempo")
public record PrevisaoTempoOrmMongo(
        @Id String id,
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