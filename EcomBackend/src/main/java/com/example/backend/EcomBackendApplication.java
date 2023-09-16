package com.example.backend;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = "com.example.backend.pojos")
public class EcomBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomBackendApplication.class, args);
	}
	
	//configure model mapper bean , with STRICT mapping instructions
			@Bean
			public ModelMapper mapper()
			{
				 ModelMapper modelMapper = new ModelMapper();
				 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
				 return modelMapper;
			}

}
