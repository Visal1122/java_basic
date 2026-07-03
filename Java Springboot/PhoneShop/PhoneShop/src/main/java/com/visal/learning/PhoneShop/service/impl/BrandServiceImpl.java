package com.visal.learning.PhoneShop.service.impl;

import java.util.Map;

import com.visal.learning.PhoneShop.exception.ResourceNotFoundException;
import com.visal.learning.PhoneShop.service.util.PageUtil;
import com.visal.learning.PhoneShop.specification.BrandFilter;
import com.visal.learning.PhoneShop.specification.BrandSpec;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.visal.learning.PhoneShop.entity.Brand;
import com.visal.learning.PhoneShop.repository.BrandRepository;
import com.visal.learning.PhoneShop.service.BrandService;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
    @Autowired
    private final BrandRepository brandRepository;

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
        orElseThrow(() -> new ResourceNotFoundException("Brand", id));
    }

    @Override
    public Brand update(Integer id, Brand brandUpdate) {
        Brand brand = getById(id);
        brand.setName(brandUpdate.getName());
        return brandRepository.save(brand);
    }

//	@Override
//	public List<Brand> getBrands() {
//		return brandRepository.findAll();
//	}

//	@Override
//	public List<Brand> getBrands(String name) {

    /// /		brandRepository.findBy()
//		return brandRepository.findByNameContainingIgnoreCase(name);
//	}
//    @Override
//    public List<Brand> getBrands(Map<String, String> params) {
//        BrandFilter brandFilter = new BrandFilter();
//        if (params.containsKey("name")){
//            String name = params.get("name");
//            brandFilter.setName(name);
//        }
//        if (params.containsKey("id")){
//            String id = params.get("id");
//            brandFilter.setId(Integer.parseInt(id));
//        }
//        BrandSpec brandSpec = new BrandSpec(brandFilter);
//
//        return brandRepository.findAll(brandSpec);
//    }
    @Override
    public Page<Brand> getBrands(Map<String, String> params) {
        BrandFilter brandFilter = new BrandFilter();
        if (params.containsKey("name")){
            String name = params.get("name");
            brandFilter.setName(name);
        }
        if (params.containsKey("id")){
            String id = params.get("id");
            brandFilter.setId(Integer.parseInt(id));
        }
        int pageSize = PageUtil.DEFAULT_PAGE_SIZE;
        if (params.containsKey(PageUtil.PAGE_SIZE)){
            pageSize = Integer.parseInt(params.get(PageUtil.PAGE_SIZE));
        }
        int pageNumber = PageUtil.DEFAULT_PAGE_NUMBER;
        if (params.containsKey(PageUtil.PAGE_NUMBER)){
            pageNumber = Integer.parseInt(params.get(PageUtil.PAGE_NUMBER));
        }
        BrandSpec brandSpec = new BrandSpec(brandFilter);
        Pageable pageable = PageUtil.getPageable(pageNumber , pageSize);
        return brandRepository.findAll(brandSpec , pageable);
    }

}
