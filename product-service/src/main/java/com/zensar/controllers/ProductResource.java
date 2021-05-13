package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Coupon;
import com.zensar.entities.Product;
import com.zensar.rest.client.CouponClient;
import com.zensar.services.ProductService;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/productapi")
public class ProductResource {
	
	

	// @Autowired
	// private RestTemplate restTemplate;

	@Autowired
	private CouponClient client;

	@Autowired
	private ProductService service;

// http://localhost:8080/productapi/products  ----> POST
	@PostMapping("/products")
	@Retry(name = "product-api",fallbackMethod = "handleError")
	public Product createProduct(@RequestBody Product product) {

		Coupon coupon = client.getCoupon(product.getCouponCode());

		// Coupon coupon =
		// restTemplate.getForObject("http://localhost:8082/couponapi/coupons/CRICKET",
		// Coupon.class);

		product.setProductPrice(product.getProductPrice() - (coupon.getDiscount()));

		return service.insertProduct(product);
	}
	
	public Product handleError(Product product,Exception exception) {
		System.out.println("Sorry,service is unavailable");
		return product;
		
	}

	

}
