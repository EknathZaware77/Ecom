package com.example.backend.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.dtos.CategoryDto;
import com.example.backend.exception.ResourceNotFoundException;
import com.example.backend.pojos.Category;
import com.example.backend.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
	public  CategoryRepository catrepo;
	
	
	@Autowired
	ModelMapper map;
	
	
	@Override
	public CategoryDto create(CategoryDto catDto) {
		Category cat=map.map(catDto, Category.class);
		Category save=catrepo.save(cat);
		return map.map(save, CategoryDto.class);
	}


	@Override
	public List<CategoryDto> getAll() {
		List<Category> listcat=catrepo.findAll();
		List<CategoryDto> alldto=listcat.stream().
				map(cat->this.map.map(cat,CategoryDto.class)).
				collect(Collectors.toList());
	return  alldto;
	
	}


	@Override
	public CategoryDto getbyId(int id) {
		Category cat=this.catrepo.findById(id)
				.orElseThrow(()-> new 
						ResourceNotFoundException(id +" id not found"));
		return map.map(cat, CategoryDto.class);
	}


	@Override
	public void deleteById(int id) {
		Category cat=this.catrepo.findById(id)
				.orElseThrow(()-> new 
						ResourceNotFoundException(id +" id not found"));
		catrepo.delete(cat);
		
	}


	@Override
	public CategoryDto update(CategoryDto dto) {
		Category mapcat=map.map(dto,Category.class);
		
		Category cat=this.catrepo.findById(dto.getCategoryId())
				.orElseThrow(()-> new 
						ResourceNotFoundException(dto.getCategoryId()+" id not found"));
		cat.setTitle(mapcat.getTitle());
		catrepo.save(cat);
		CategoryDto updateDto=map.map(dto,CategoryDto.class);
		return updateDto;
	}

	
	

	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
