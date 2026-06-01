package com.visal.learning.PhoneShop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visal.learning.PhoneShop.entity.Model;
import com.visal.learning.PhoneShop.repository.ModelRepository;
import com.visal.learning.PhoneShop.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService{
	
	@Autowired
	ModelRepository modelRepository;
	
	@Override
	public Model createModel(Model model) {
		return modelRepository.save(model);
	}

}