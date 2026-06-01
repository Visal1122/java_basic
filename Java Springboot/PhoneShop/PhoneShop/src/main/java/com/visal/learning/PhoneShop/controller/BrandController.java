package com.visal.learning.PhoneShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visal.learning.PhoneShop.dto.BrandDTO;
import com.visal.learning.PhoneShop.entity.Brand;
import com.visal.learning.PhoneShop.service.BrandService;
import com.visal.learning.PhoneShop.service.util.BrandMapper;

@RestController
@RequestMapping("/brands")
public class BrandController {
	@Autowired
	private BrandService brandService;
	
	@PostMapping
	public ResponseEntity<?> create (@RequestBody BrandDTO brandDTO){
		Brand brand = BrandMapper.toBrand(brandDTO);
		 brand = brandService.create(brand);
		return ResponseEntity.ok(brand);
	}

	@GetMapping
	public String test() {
	    return "Get from the table brand";
	}

}
