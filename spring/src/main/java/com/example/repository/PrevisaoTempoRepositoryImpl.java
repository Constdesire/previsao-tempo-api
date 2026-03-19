package com.example.repository;

import com.example.entity.PrevisaoTempo;
import com.example.repository.adapter.PrevisaoTempoRepositoryAdapter;
import com.example.repository.mongo.PrevisaoTempoRepositoryWithMongoDB;
import com.example.repository.orm.PrevisaoTempoOrmMongo;
import org.springframework.stereotype.Repository;

@Repository
public class PrevisaoTempoRepositoryImpl implements PrevisaoTempoRepository {

    private final PrevisaoTempoRepositoryWithMongoDB repository;

    public PrevisaoTempoRepositoryImpl(PrevisaoTempoRepositoryWithMongoDB repository) {
        this.repository = repository;
    }

    @Override
    public PrevisaoTempo salvar(PrevisaoTempo previsao) {
        PrevisaoTempoOrmMongo orm = PrevisaoTempoRepositoryAdapter.castEntity(previsao);
        PrevisaoTempoOrmMongo salvo = repository.save(orm);
        return PrevisaoTempoRepositoryAdapter.castOrm(salvo);
    }
}