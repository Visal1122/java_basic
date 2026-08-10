package com.visal.learning.PhoneShop.controller;

import com.visal.learning.PhoneShop.mapper.BrandsMapper;
import com.visal.learning.PhoneShop.mapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visal.learning.PhoneShop.dto.ModelDTO;
import com.visal.learning.PhoneShop.entity.Model;
import com.visal.learning.PhoneShop.service.ModelService;

@RestController
@RequestMapping("/models")
@RequiredArgsConstructor

public class ModelController {

	private final ModelService modelService;
	private final ModelMapper modelMapper ;
	@PostMapping
	public ResponseEntity<?> create(@RequestBody ModelDTO modelDTO){
		Model model = modelMapper.toModelEntity(modelDTO);
		model = modelService.createModel(model);
		return ResponseEntity.ok(model);
	}
	
	@GetMapping
	public String test() {
		return "Get from Model";
	}
}
