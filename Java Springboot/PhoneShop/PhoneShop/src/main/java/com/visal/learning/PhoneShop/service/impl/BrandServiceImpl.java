package com.visal.learning.PhoneShop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visal.learning.PhoneShop.entity.Brand;
import com.visal.learning.PhoneShop.repository.BrandRepository;
import com.visal.learning.PhoneShop.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

}
