package com.codinghub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Entity.Product;
import com.codinghub.Service.ProductService;

@RestController
@RequestMapping("/product")

public class ProductController {
	@Autowired
	ProductService service;
	
	@PutMapping("/save")
	public String save(@RequestBody Product product)
	{
		
		 service.save(product);
		 return "inserted succesfully";
	}
	
	@GetMapping("/all")
	public Iterable<Product> findAll()
	{
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Product findById(@PathVariable  int id)
	{
		return  service.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int  id)
	{
		return service.delete(id);
	 
	}
	@GetMapping("/findBy/{name}")
	public Object findByName(@PathVariable String name)
	{
		Iterable<Product> product =service.findByName(name);
		if(!product.iterator().hasNext())
		{
			return "Product is not available right now";
			
		}
				return product;
		
	}
	@GetMapping("/fb/{price}")
	public Iterable<Product> findByPrice(@PathVariable double price)
	{
		return service.findByPPrice(price);
		
	}
	

}
