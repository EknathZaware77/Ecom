package com.example.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	public ResponseEntity<Product> createProduct(@RequestBody Product p) {
		
		System.out.println(p);
		Product product= productService.createProduct(p);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/view")

	public ResponseEntity<List<Product>> ViewAllProduct(){
		List<Product> list= productService.viewAllProduct();
		return new  ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
	
	@GetMapping("view/{id}")
   @ResponseBody
	public ResponseEntity<Product> getById(@PathVariable Long id ) {
		
		Product product=productService.getById(id);
		return new ResponseEntity<Product>(product,HttpStatus.ACCEPTED);
	}
	
	
	//delete product by id
	@DeleteMapping("del/{id}")
	public ResponseEntity<String> deleteProduct( @PathVariable long id ) 
	{
		
		productService.deleteProducbyId(id);
		
		return new ResponseEntity<String>("Product deleted",HttpStatus.OK);
	}
	
	
	//update product 
	@PutMapping("/update")
	public Product updateProduct() {
		
		
		
		return null;
	
		
	}
	
	
	
	
	
	
	
}
