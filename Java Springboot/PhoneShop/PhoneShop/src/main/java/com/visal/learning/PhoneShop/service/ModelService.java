package com.visal.learning.PhoneShop.service;

import com.visal.learning.PhoneShop.entity.Model;

import java.util.List;

public interface ModelService {
	Model createModel(Model model);
	List<Model> getByBrand(Integer brandId);
}
