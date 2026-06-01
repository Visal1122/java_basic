package com.visal.learning.PhoneShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visal.learning.PhoneShop.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
}
