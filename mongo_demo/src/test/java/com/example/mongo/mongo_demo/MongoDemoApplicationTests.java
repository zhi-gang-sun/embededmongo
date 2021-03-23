package com.example.mongo.mongo_demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan({"com.example.mongo.*"})
class MongoDemoApplicationTests {

	@Autowired
	ProductRepo repo;
	
	@Test
	public void testSave(){
		Product product =  new Product();
		product.setName("mac pro");
		product.setPrice(4000);

		Product result = repo.save(product);
		assertNotNull(result);
	}

}
