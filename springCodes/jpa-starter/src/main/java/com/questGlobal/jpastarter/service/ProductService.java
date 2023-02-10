package com.questGlobal.jpastarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questGlobal.jpastarter.model.Product;
import com.questGlobal.jpastarter.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public List<Product> searchProducts(String query) {
		return productRepository.searchProducts(query);
		
	}
	
	public  Product create(Product p) {
		return productRepository.save(p);
	}
	
	public  List<Product> findAll() {
		return productRepository.findAll();

	}



}
