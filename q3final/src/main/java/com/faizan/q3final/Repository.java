package com.faizan.q3final;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface Repository extends MongoRepository<Article, String> {


    public Article findArticleById(String id);
    public List<Article> findArticleByLabel(String label);

}
