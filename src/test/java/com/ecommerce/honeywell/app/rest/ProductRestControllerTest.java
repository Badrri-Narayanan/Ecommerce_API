package com.ecommerce.honeywell.app.rest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecommerce.honeywell.app.repository.ProductRepository;

@SpringBootTest
class ProductRestControllerTest {

	@Autowired
	ProductRepository productRepositiry;
	
	@Test
	void testGetProducts() {
		assertTrue(productRepositiry.findAll().size() > 0);
	}

}
