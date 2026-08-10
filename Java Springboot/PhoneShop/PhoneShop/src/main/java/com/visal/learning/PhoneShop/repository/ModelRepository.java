package com.visal.learning.PhoneShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visal.learning.PhoneShop.entity.Model;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Integer>{
    List<Model> findByBrandId(Integer brandId);
}
