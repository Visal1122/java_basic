package com.visal.learning.PhoneShop.mapper;

import com.visal.learning.PhoneShop.dto.BrandDTO;
import com.visal.learning.PhoneShop.entity.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BrandsMapper {
    BrandsMapper INSTANCE = Mappers.getMapper(BrandsMapper.class);
    Brand toBrandEntity(BrandDTO brandDTO);
    BrandDTO toBrandDTO(Brand brand);
}
