package com.codinghub.Service;

import com.codinghub.Entity.Product;

public interface ProductService {

	
	Iterable<Product> findAll();

	String save(Product product);
	
	Product findById(int id);
	
	Iterable<Product> findByName(String name);
	
	String delete(int id);

	Iterable<Product> findByPPrice(double price);

}
