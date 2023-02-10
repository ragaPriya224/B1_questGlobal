package com.questGlobal.jpastarter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.questGlobal.jpastarter.model.Product;
import com.questGlobal.jpastarter.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	//(localhost:8085/api/v1/products/search?query=card)
	@GetMapping(value = "/search")
	public  ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query) {
		return ResponseEntity.ok(productService.searchProducts(query));

	}

	@PostMapping
	public  Product createProduct(@RequestBody Product p) {
		return productService.create(p);

	}
	@GetMapping
	public  List<Product> getProducts() {
		return productService.findAll();

	}
	@GetMapping("/page")
	public  Page<Product>  getProducts(@RequestParam("pageNo") Optional<Integer> pageParam,
			@RequestParam("sort") Optional<String>  sortBy){
		System.out.println("-----------------------------------------");
		return productService.getProductsByPage(pageParam,sortBy);

	}



}
