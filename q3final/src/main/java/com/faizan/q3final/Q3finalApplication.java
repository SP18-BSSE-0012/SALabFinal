package com.faizan.q3final;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Q3finalApplication implements CommandLineRunner {

	@Autowired
	private Repository repository;

	public static void main(String[] args) {
		SpringApplication.run(Q3finalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Article("1","Realme 8","Smartphone","Oppo"));
		repository.insert(new Article("2","T-Shirt","Male Shirts","Fashion4us"));
		repository.insert(new Article("3","Notebook 5730","Laptop","HP"));

		System.out.println("\nFollowing is the data that was inserted\n");
		for (Article rep : repository.findAll() )
		{
			System.out.println(rep);
		}

		System.out.println("Article found by using findById and passing Id 3\n");
		Article repo = repository.findArticleById("3");
		System.out.println(repo);
		repo.vendor="Saggy-Jeans";
		repository.save(repo);
		System.out.println("Data after updating an article\n");
		for (Article rep : repository.findAll() )
		{
			System.out.println(rep);
		}
		repository.deleteById("2");
		System.out.println("Data printed after deleting article with ID 2\n");
		for (Article rep : repository.findAll() )
		{
			System.out.println(rep);
		}

	}
}
