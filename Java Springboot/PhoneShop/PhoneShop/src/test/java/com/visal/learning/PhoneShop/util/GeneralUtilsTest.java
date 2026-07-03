package com.visal.learning.PhoneShop.util;

import com.visal.learning.PhoneShop.service.util.GeneralUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralUtilsTest {

    @Test
    public void testToIntegerList() {
        //Given
        List<String> names = List.of("Visal", "Nan", "Jing");
        //When
        List<Integer> integerList = GeneralUtils.toIntegerList(names);
        //then
        //[5,3,4]
        //3
        assertEquals(3 , integerList.size());
        assertEquals(5 , integerList.get(0));
        assertEquals(3 , integerList.get(1));
        assertEquals(4 , integerList.get(2));

    }

    @Test
    public void testGetEvenNumber(){
        //Given
        List<Integer> numbers = List.of(2 , 1 , 7 ,10 , 5 , 12 , 3 , 8 , 6 );
        //when
        List<Integer> evenNumber = GeneralUtils.getEvenNumber(numbers);
        //then
        // size = 5
        // [2,10,12,8,6]
        assertEquals(5 , evenNumber.size());
        assertEquals(2 , evenNumber.get(0));
        assertEquals(10 , evenNumber.get(1));
        assertEquals(12 , evenNumber.get(2));
        assertEquals(8 , evenNumber.get(3));
        assertEquals(6 , evenNumber.get(4));

    }
}