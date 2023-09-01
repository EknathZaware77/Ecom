package com.example.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.pojos.Product;
import com.example.backend.service.ProductService;
import com.example.backend.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/create")
	
	public Product createProduct(@RequestBody Product p) {
		
		System.out.println(p);
		return productService.createProduct(p);
		
		
	}
	
	
	@GetMapping("/view")

	public List<Product> ViewAllProduct(){
		List<Product> list= productService.viewAllProduct();
		return list;
	}
	
	
	@GetMapping("view/{id}")
	//@ResponseBody
	public Optional<Product> getById(@PathVariable Long id ) {
		
		return productService.getById(id);
	}
	
	
	//delete product by id
	@DeleteMapping("del/{id}")
	public void deleteProduct( @PathVariable long id ) 
	{
		
		productService.deleteProducbyId(id);
	}
	
	
	//update product 
	@PutMapping("/update")
	public Product updateProduct() {
		
		
		
		return null;
	
		
	}
	
	
	
	
	
	
	
}
