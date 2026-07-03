package com.visal.learning.PhoneShop.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import com.visal.learning.PhoneShop.entity.Brand;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> , JpaSpecificationExecutor<Brand> {
	List<Brand> findByNameContainingIgnoreCase(String name);
}
