package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Coupon;
import com.zensar.services.CouponService;

@RestController
@RequestMapping("/couponapi")
public class CouponResource {
	
	@Autowired
	private CouponService service;
	
	
	// http://localhost:8080/couponapi/coupons  ->  POST
	@PostMapping("/coupons")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return service.saveCoupon(coupon);
	}
	
	
	// http://localhost:8082/couponapi/coupons/CRICKET
	@GetMapping("/coupons/{couponCode}")
	public Coupon getCoupon(@PathVariable("couponCode")String couponCode) {
		return service.getCoupon(couponCode);
	}
	

}
