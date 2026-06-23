package com.visal.learning.PhoneShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
		Brand brand = BrandMapper.toBrandEntity(brandDTO);
		brand = brandService.create(brand);
		return ResponseEntity.ok(BrandMapper.toBrandDTO(brand));
	}

	@GetMapping
	public String test() {
	    return "Get from the table brand 1111";
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> GetOneBrand(@PathVariable("id") Integer brandId){
		Brand brand = brandService.getById(brandId);

		return ResponseEntity.ok(BrandMapper.toBrandDTO(brand));
//		return ResponseEntity.ok("get method work");
	}
	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer brandID , @RequestBody BrandDTO brandDTO){
		Brand brand = BrandMapper.toBrandEntity(brandDTO);
		Brand update = brandService.update(brandID , brand);
		return ResponseEntity.ok(BrandMapper.toBrandDTO(update));
	}

}
