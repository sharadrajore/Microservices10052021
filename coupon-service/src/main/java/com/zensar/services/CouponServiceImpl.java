package com.zensar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entities.Coupon;
import com.zensar.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository repository;

	public Coupon saveCoupon(Coupon coupon) {
		return repository.save(coupon);
	}

	@Override
	public Coupon getCoupon(String couponCode) {
		return repository.findByCouponCode(couponCode);
	}

}
