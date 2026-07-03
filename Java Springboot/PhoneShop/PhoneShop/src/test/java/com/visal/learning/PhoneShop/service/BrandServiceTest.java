package com.visal.learning.PhoneShop.service;

import com.visal.learning.PhoneShop.entity.Brand;
import com.visal.learning.PhoneShop.exception.ResourceNotFoundException;
import com.visal.learning.PhoneShop.repository.BrandRepository;
import com.visal.learning.PhoneShop.service.impl.BrandServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BrandServiceTest {

    @Mock
    private BrandRepository brandRepository;

    private BrandService brandService;

    @BeforeEach
    public void setUp(){
        brandService = new BrandServiceImpl(brandRepository);
    }
    /*
    @Test
    public void testCreate(){
        //given
        Brand brand = new Brand();
        brand.setName("Oppo");
        brand.setId(1);
        //when
        when(brandRepository.save(any(Brand.class))).thenReturn(brand);
        Brand brandReturn = brandService.create(new Brand());
        //then
        assertEquals(1 , brandReturn.getId());
        assertEquals("Oppo" , brandReturn.getName());
    }
     */
    @Test
    public void testCreate(){
        //given
        Brand brand = new Brand();
        brand.setName("Oppo");

        //when
        brandService.create(brand);

        //then
        verify(brandRepository , times(1)).save(brand);
    }

    @Test
    public void testGetById(){


        //given
        Brand brand = new Brand();
        brand.setName("Xiaomi");
        brand.setId(1);
        //when
        when(brandRepository.findById(1)).thenReturn(Optional.of(brand));
        Brand result = brandService.getById(1);
        //then
        assertEquals(1 , result.getId());
        assertEquals("Xiaomi" , result.getName());
    }

    @Test
    public void testGetByIdException(){
        //given

        //when
        when(brandRepository.findById(2)).thenReturn(Optional.empty());
        assertThatThrownBy(() -> brandService.getById(2))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessage("%s with id = %d is not found".formatted("Brand" , 2));
        //then

    }
    @Test
    public void testUpdate(){

        //given
        Brand brand = new Brand();
        brand.setId(1);
        brand.setName("Samsung");

        Brand toUpdate = new Brand();
        toUpdate.setName("Oppo");
        //when
        when(brandRepository.findById(1)).thenReturn(Optional.of(brand));
        when(brandRepository.save(brand)).thenReturn(brand);
        brandService.update(1, toUpdate);

        //then
        assertEquals(1 , brand.getId());
        assertEquals("Oppo" , brand.getName());
        verify(brandRepository , times(1)).findById(1);
        verify(brandRepository , times(1)).save(brand);
    }
}
