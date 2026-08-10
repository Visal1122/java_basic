package com.visal.learning.PhoneShop.mapper;

import com.visal.learning.PhoneShop.dto.ModelDTO;
import com.visal.learning.PhoneShop.entity.Brand;
import com.visal.learning.PhoneShop.entity.Model;
import com.visal.learning.PhoneShop.service.BrandService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring" , uses = {BrandService.class})
public interface ModelMapper {

    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    @Mapping(target = "brand" , source  = "brandId")
    Model toModelEntity(ModelDTO dto);

    @Mapping(target = "brandId" , source = "brand.id")
    ModelDTO toModelDTO(Model model);
//    default Brand toBrandEntity(Integer brandId){
//        Brand brand = new Brand();
//        brand.setId(brandId);
//        return brand;
//    }
}
