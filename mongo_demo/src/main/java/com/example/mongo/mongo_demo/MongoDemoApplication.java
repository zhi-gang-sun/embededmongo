package com.example.mongo.mongo_demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDemoApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		
		UUID id =  UUID.randomUUID();
		product.setName(id.toString());
		product.setPrice(2000);

		Product result = repo.save(product);

		System.out.println("----------------"+ result.getId());
	}

}
