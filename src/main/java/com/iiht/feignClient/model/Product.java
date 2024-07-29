package com.iiht.feignClient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	int productId;
	String name;
	String category;
	String brand;
	double price;
}
