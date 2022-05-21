package com.ecommerce.honeywell.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.honeywell.app.entity.Product;
import com.ecommerce.honeywell.app.repository.ProductRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	ProductRepository productRepositiry;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productRepositiry.findAll();
	}
}
