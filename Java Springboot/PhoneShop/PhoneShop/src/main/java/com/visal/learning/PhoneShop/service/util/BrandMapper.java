package com.visal.learning.PhoneShop.service.util;

import com.visal.learning.PhoneShop.dto.BrandDTO;
import com.visal.learning.PhoneShop.entity.Brand;

public class BrandMapper {
	public static Brand toBrand(BrandDTO dto) {
		Brand brand = new Brand();
		brand.setId(dto.getId());
		brand.setName(dto.getName());
		return brand;
		
	}
}
