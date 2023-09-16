package com.example.backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.pojos.Category;


public interface CategoryRepository  extends JpaRepository< Category, Integer> {

	

	
	
}
