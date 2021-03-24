package com.example.mongo.mongo_demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan("{com.example.mongo.*}")
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
	
//	@Test
//	public void testFindAll(){
//		//List<Product> list = repo.findAll();
//		//Assertions.assertEquals(2, list.size());
//	}
	
	@Test
	public void testDelete() {
		repo.deleteById("6059eddbb07913507f4eec74");
		
		Optional<Product> p =  repo.findById("6059eddbb07913507f4eec74");
		
		Assertions.assertEquals(Optional.empty(), p);
		
		//assertNull(Optional.empty(), p);
	}

}
