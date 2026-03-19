package com.example.repository.mongo;

import com.example.repository.orm.PrevisaoTempoOrmMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrevisaoTempoRepositoryWithMongoDB extends MongoRepository<PrevisaoTempoOrmMongo, String> {
}