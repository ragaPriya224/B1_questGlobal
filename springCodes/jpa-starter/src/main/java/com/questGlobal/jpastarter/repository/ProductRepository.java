package com.questGlobal.jpastarter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.questGlobal.jpastarter.model.Product;
import com.questGlobal.jpastarter.model.Topic;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{

	
	
	@Query("select p from Product p  where "+
			"p.name like concat('%', :query, '%')"+
			"OR p.description like concat('%', :query, '%')")
	List<Product> searchProducts(String query);
	
	@Query(value = "select * from products p  where "+
			"p.name like concat('%', :query, '%')"+
			"OR p.description like concat('%', :query, '%')", nativeQuery=true)
	List<Product> searchProductsSql(String query);
	
}
