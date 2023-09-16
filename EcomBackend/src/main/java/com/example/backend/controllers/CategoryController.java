package com.example.backend.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dtos.CategoryDto;
import com.example.backend.pojos.Category;
import com.example.backend.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	
	@Autowired
	private CategoryService catser;
	
	//create
	@PostMapping("/create")
	public ResponseEntity<CategoryDto> create(@RequestBody CategoryDto catDto)
	{    
		CategoryDto cat=catser.create(catDto);
		return new ResponseEntity<CategoryDto>(cat,HttpStatus.CREATED);
		
	}
	
	
	
	//getlist
	@GetMapping("/view")
	public ResponseEntity<List<CategoryDto>> getList(){
		List<CategoryDto> dto=catser.getAll();
		return new ResponseEntity<List<CategoryDto>>(dto,HttpStatus.OK);
	}
	
	
	
	
	
	//get
	@GetMapping("/view/{id}")
	public ResponseEntity<CategoryDto> getById(@PathVariable int id  ){
		CategoryDto dto=catser.getbyId(id);
		return new ResponseEntity<CategoryDto>(dto,HttpStatus.OK);
	}
	
	
	
	
	
	
	//delete
	@DeleteMapping("/Del/{id}")
	public void deleteById(@PathVariable int id ) {
		
		catser.deleteById(id);
	}
	
	
	
	
	
	
	//update
	@PutMapping("/update")
	public CategoryDto updateCat( @RequestBody CategoryDto dto) {
		CategoryDto newdto=catser.update(dto);
		return newdto;
	}
	
	
	
	
	
	
	
}
