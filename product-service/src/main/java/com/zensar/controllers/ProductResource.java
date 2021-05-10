package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		return service.insertProduct(product);
	}

}
