package com.visal.learning.PhoneShop.service;

import com.visal.learning.PhoneShop.entity.Brand;

public interface BrandService {
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id , Brand brand);
}
