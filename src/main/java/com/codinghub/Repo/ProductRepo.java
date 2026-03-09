package com.codinghub.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.Entity.Product;
@Repository
public interface ProductRepo  extends CrudRepository<Product,Integer>
{

	
	Optional<Product> findById(int id);

	Iterable<Product> findByName(String name);

	Iterable<Product> findByPriceLessThanEqual(double price);

}
