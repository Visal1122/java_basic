package com.visal.learning.PhoneShop.dto;

import com.visal.learning.PhoneShop.entity.Brand;

import lombok.Data;
@Data
public class ModelDTO {
	private Integer id;
	private String name;
	private Brand brand;
}
