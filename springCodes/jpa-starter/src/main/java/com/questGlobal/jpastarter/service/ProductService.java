package com.questGlobal.jpastarter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
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

	public Page<Product> getProductsByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
		// TODO Auto-generated method stub
		return	productRepository.findAll(PageRequest.of(pageParam.orElse(0), 3,
				Direction.ASC,sortBy.orElse("id")));
	}



}
