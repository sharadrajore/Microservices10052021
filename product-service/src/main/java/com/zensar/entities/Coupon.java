package com.zensar.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Coupon {

	
	private int couponId;
	private String couponCode;
	private long discount;
	private String expiryDate;

}
