package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.dtos.ProductDto;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.pojos.Product;
import com.example.backend.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;
	
	
	@Override
	public Product createProduct(Product product) {
     
		Product save= productRepository.save(product);
		System.out.println(save);
		return save;
	}


	@Override
	public List<Product> viewAllProduct() {
		
		return productRepository.findAll() ;
	}


	@Override
	public Product getById(Long id) {
		// TODO Auto-generated method stub
		   Product product=productRepository.findById(id)
				   .orElseThrow(()-> new ResourceNotFoundException(id +" id not found"));
		 
		 return product;
	}


	@Override
	public void deleteProducbyId(long id) {
		 Product product=productRepository.findById(id)
				   .orElseThrow(()-> new ResourceNotFoundException(id +" id not exists"));
		 

		productRepository.delete(product);
		
	}

	
	
	
	
	

}
