package com.visal.learning.PhoneShop.service.impl;

import com.visal.learning.PhoneShop.service.BrandService;
import com.visal.learning.PhoneShop.service.util.GeneralUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visal.learning.PhoneShop.entity.Model;
import com.visal.learning.PhoneShop.repository.ModelRepository;
import com.visal.learning.PhoneShop.service.ModelService;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService{
	
	@Autowired
	ModelRepository modelRepository;
	@Autowired
	BrandService brandService;


	@Override
	public Model createModel(Model model) {

		return modelRepository.save(model);
	}

	@Override
	public List<Model> getByBrand(Integer brandId) {
		return modelRepository.findByBrandId(brandId);
	}

}