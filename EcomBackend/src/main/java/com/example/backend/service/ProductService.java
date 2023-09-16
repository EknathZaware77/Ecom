package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import com.example.backend.pojos.Product;

public interface ProductService {

	public Product createProduct(Product product);

	public List<Product> viewAllProduct();

	public Product getById(Long id);

	public void deleteProducbyId(long id);
	
	
}
