package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.entities.Coupon;
import com.zensar.entities.Product;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductResource {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ProductService service;

	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {

		Coupon coupon = restTemplate.getForObject("http://localhost:8082/couponapi/coupons/CRICKET", Coupon.class);

		product.setProductPrice(product.getProductPrice() - (coupon.getDiscount()));

		return service.insertProduct(product);
	}

}
