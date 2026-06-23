package com.visal.learning.PhoneShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visal.learning.PhoneShop.entity.Brand;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	List<Brand> findByNameContainingIgnoreCase(String name);
}
