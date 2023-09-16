package com.example.backend.service;

import java.util.List;

import com.example.backend.dtos.CategoryDto;

public interface CategoryService {

	CategoryDto create(CategoryDto catDto);

	List<CategoryDto> getAll();

	CategoryDto getbyId(int id);

	void deleteById(int id);

	CategoryDto update(CategoryDto dto);

	
	
	
	
	
	
	
	
}
