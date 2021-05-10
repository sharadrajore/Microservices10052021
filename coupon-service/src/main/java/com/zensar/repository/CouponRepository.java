package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entities.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
