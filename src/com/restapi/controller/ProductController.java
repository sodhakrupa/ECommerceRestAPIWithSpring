package com.restapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Product;
import com.restapi.service.ProductService;

@RestController
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	private ProductService productService = new ProductService();

	//http://localhost:8080/ECommerceSpringAPI/product/
	@GetMapping(value="/product")
	public List<Product> fetchProducts(){	
		logger.info("Inside fetchProducts");
		System.out.println("Inside fetchProducts");
		return productService.fetchProducts();
		 
	}
	
	
}
