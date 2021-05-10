package com.zensar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
