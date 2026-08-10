package com.visal.learning.PhoneShop.repository;

import com.visal.learning.PhoneShop.entity.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class BrandRepositoryTest {

    @Autowired
    BrandRepository brandRepository;

    @Test
    public void testFindByNameContainingIgnoreCase(){

//        //given
//        Brand brand = new Brand();
//        brand.setName("Vivo");
//        brandRepository.save(brand);
//        Brand brand1 = new Brand();
//        brand1.setName("Xiaomi");
//        brandRepository.save(brand1);
//
//        //when
//        List<Brand> brands = brandRepository.findByNameContainingIgnoreCase("I");
//
//        //then
//        assertEquals(3 , brands.size());
//        assertEquals("Vivo" , brands.get(0).getName());
//        assertEquals(1 , brands.get(0).getId());



    }



}
