package com.example.mongo.mongo_demo;

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

		product.setName("thinkpad");
		product.setPrice(1000);

		Product result = repo.save(product);

		System.out.println("----------------"+ result.getId());
	}

}
