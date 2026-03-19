package com.example.repository.adapter;

import com.example.entity.PrevisaoTempo;
import com.example.repository.orm.PrevisaoTempoOrmMongo;

public class PrevisaoTempoRepositoryAdapter {
    private PrevisaoTempoRepositoryAdapter() {}

    public static PrevisaoTempo castOrm(PrevisaoTempoOrmMongo orm) {
        return new PrevisaoTempo(orm.id(), orm.latitude(), orm.longitude(), orm.tempoZona(), orm.dataHora(), orm.temperaturaDia(), orm.unidadeTemperaturaDia(), orm.vento(), orm.unidadeVento());
    }

    public static PrevisaoTempoOrmMongo castEntity(PrevisaoTempo entity) {
        return new PrevisaoTempoOrmMongo(entity.id(), entity.latitude(), entity.longitude(), entity.tempoZona(), entity.dataHora(), entity.temperaturaDia(), entity.unidadeTemperaturaDia(), entity.vento(), entity.unidadeVento());
    }
}
