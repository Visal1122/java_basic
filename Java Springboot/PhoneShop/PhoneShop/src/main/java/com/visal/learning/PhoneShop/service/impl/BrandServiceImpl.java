package com.visal.learning.PhoneShop.service.impl;

import java.util.List;

import com.visal.learning.PhoneShop.exception.ResourceNotFoundException;
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

	@Override
	public Brand getById(Integer id) {
//		Optional<Brand> findbyId = brandRepository.findById(id);
//		if(findbyId.isPresent()) {
//			return findbyId.get();
//		}
//		else throw new HttpClientErrorException(HttpStatus.NOT_FOUND , "Brand with id = %d is not found ".formatted(id));
		return brandRepository.findById(id).
				//orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND , "Brand with id = %d is not found ".formatted(id)));
//				orElseThrow(() -> new ApiException(HttpStatus.NOT_FOUND , "Brand with id = %d is not found".formatted(id)));
				orElseThrow(() -> new ResourceNotFoundException("Brand" , id));
	}

	@Override
	public Brand update(Integer id , Brand brandUpdate) {
		Brand brand = getById(id);
		brand.setName(brandUpdate.getName());
		return brandRepository.save(brand);
	}

	@Override
	public List<Brand> getBrands() {
		return brandRepository.findAll();
	}

	@Override
	public List<Brand> getBrands(String name) {
//		brandRepository.findBy()
		return brandRepository.findByNameContainingIgnoreCase(name);
	}


}
