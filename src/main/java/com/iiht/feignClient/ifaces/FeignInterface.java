package com.iiht.feignClient.ifaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.feignClient.model.Product;
@FeignClient(value = "feignClient" ,url="http://localhost:7071/product-service")
public interface FeignInterface {
	
	@RequestMapping(method=RequestMethod.GET, value="/products")
	public List<Product> getProducts();

    @RequestMapping(method= RequestMethod.GET, value= "/products-by-id/{id}", produces="application/json")
	public Product getProductsById(@PathVariable ("id") int id);

	@RequestMapping(method=RequestMethod.GET, value="/products-by-category/{category}", produces="application/json")
	public List<Product> getProductsByCategory(@PathVariable ("category") String category);
}
