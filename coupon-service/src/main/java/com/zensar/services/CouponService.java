package com.zensar.services;

import com.zensar.entities.Coupon;

public interface CouponService {

	public Coupon saveCoupon(Coupon coupon);

	public Coupon getCoupon(String couponCode);

}
