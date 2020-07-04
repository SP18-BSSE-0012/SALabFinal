package com.faizan.q3final;

public class Resource {


    Repository articleRepository;
    public Article findByID(String id)
    {
        return articleRepository.findArticleById(id);
    }

    public void insert(Article article)
    {
        System.out.println("Insert Success!");
        Article repo = articleRepository.save(article);
        System.out.println(repo);
    }

    public void update(Article article)
    {
        System.out.println("Update Success!");
        articleRepository.save(article);
    }

    public void deleteByID(String id)
    {
        articleRepository.deleteById(id);
        System.out.println("Delete Success!");
    }

    public void findAllArticles()
    {
        for (Article rep : articleRepository.findAll() )
        {
            System.out.println(rep);
        }
    }

}
