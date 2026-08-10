package com.visal.learning.PhoneShop.controller;

import com.visal.learning.PhoneShop.dto.ModelDTO;
import com.visal.learning.PhoneShop.dto.PageDTO;
import com.visal.learning.PhoneShop.entity.Model;
import com.visal.learning.PhoneShop.mapper.BrandsMapper;
import com.visal.learning.PhoneShop.mapper.ModelMapper;
import com.visal.learning.PhoneShop.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.visal.learning.PhoneShop.dto.BrandDTO;
import com.visal.learning.PhoneShop.entity.Brand;
import com.visal.learning.PhoneShop.service.BrandService;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/brands")
public class BrandController {

    private final BrandService brandService;
    private final ModelService modelService;
    private final ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
//		Brand brand = BrandMapper.toBrandEntity(brandDTO);
        Brand brand = BrandsMapper.INSTANCE.toBrandEntity(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(BrandsMapper.INSTANCE.toBrandDTO(brand));
    }

//	@GetMapping
//	public String test() {
//	    return "Get from the table brand 1111";
//	}

    @GetMapping("{id}")
    public ResponseEntity<?> GetOneBrand(@PathVariable("id") Integer brandId) {
        Brand brand = brandService.getById(brandId);

        return ResponseEntity.ok(BrandsMapper.INSTANCE.toBrandDTO(brand));
    }

    //	@GetMapping
//	public  ResponseEntity<?> getBrands(){
//		List<BrandDTO> list = brandService.getBrands()
//				.stream()
//				.map(brand -> BrandsMapper.INSTANCE.toBrandDTO(brand))
//				.toList();
//
//		return ResponseEntity.ok(list);
//	}
//	@GetMapping
//	public  ResponseEntity<?> getBrands(@RequestParam Map<String , String> params ){
//		List<BrandDTO> list = brandService.getBrands(params)
//				.stream()
//				.map(brand -> BrandsMapper.INSTANCE.toBrandDTO(brand))
//				.toList();
//
//		return ResponseEntity.ok(list);
//	}
    @GetMapping
    public ResponseEntity<?> getBrands(@RequestParam Map<String, String> params) {
        Page<Brand> page = brandService.getBrands(params);
        PageDTO dto = new PageDTO(page);

        return ResponseEntity.ok(dto);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer brandID, @RequestBody BrandDTO brandDTO) {
        Brand brand = BrandsMapper.INSTANCE.toBrandEntity(brandDTO);
        Brand update = brandService.update(brandID, brand);
        return ResponseEntity.ok(BrandsMapper.INSTANCE.toBrandDTO(update));
    }

    @GetMapping("{id}/models")
    public ResponseEntity<?> getModelsByBrand(@PathVariable("id") Integer brandId) {
        List<Model> models = modelService.getByBrand(brandId);
        List<ModelDTO> list = models.stream()
                .map(model -> modelMapper.toModelDTO(model))
                .toList();

        return ResponseEntity.ok(list);
    }
}
