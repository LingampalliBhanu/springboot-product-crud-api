package com.codinghub.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codinghub.Entity.Product;
import com.codinghub.Repo.ProductRepo;

@Service

public class ProductServiceImpl implements ProductService {
	@Autowired
	public ProductRepo repo;

	@Override
	public Iterable<Product> findAll() {
		
		return repo.findAll();
	}

	
	@Override
	public Product findById(int id) 
	{
		return repo.findById(id).orElse(null);
	}

	@Override
	public String delete(int p_id) 
	{
		Optional<Product> opt=repo.findById(p_id);
		if(opt.isPresent())
		{
			Product pt=opt.get();
			repo.delete(pt);
			return "Product with id = " +p_id +"Deleted successfully";
		}else
			return "Product does not exist";	
	}
	@Override
	public Iterable<Product> findByName(String name) {
		
		return repo.findByName(name);
	}

	

	@Override
	public String save(Product product) {
	
		Optional<Product> opt = repo.findById(product.getId());

        if (opt.isPresent()) {

            Product pt = opt.get();
            pt.setName(product.getName());
            pt.setPrice(product.getPrice());
            pt.setAvailabilityStatus(product.getAvailabilityStatus());

            repo.save(pt);

            return "Product with id = "  + " Updated Successfully\n" + pt;

        } else {
            repo.save(product);
            return "Product inserted successfully";
        }	
}


	@Override
	public Iterable<Product> findByPPrice(double price) {
		return repo.findByPriceLessThanEqual(price);
	}


}

