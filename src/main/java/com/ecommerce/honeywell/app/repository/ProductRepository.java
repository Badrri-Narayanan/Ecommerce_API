package com.ecommerce.honeywell.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.honeywell.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
