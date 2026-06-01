package com.visal.learning.PhoneShop.service.util;

import com.visal.learning.PhoneShop.dto.ModelDTO;
import com.visal.learning.PhoneShop.entity.Model;

public class ModelMapper {
	public static Model toModel(ModelDTO modelDTO) {
		Model model = new Model();
		model.setId(modelDTO.getId());
		model.setName(modelDTO.getName());
		model.setBrand(modelDTO.getBrand());
		return model;
		
	}
}
