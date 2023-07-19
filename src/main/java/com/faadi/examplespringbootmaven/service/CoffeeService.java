package com.faadi.examplespringbootmaven.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.faadi.examplespringbootmaven.entity.Coffee;

@Service
public class CoffeeService {


	public List<Coffee> findAll(){
		List<Coffee> coffeeList = Arrays.asList(
				new Coffee((long) 1,"Black Coffee", "Schwarz Kaffee"),
				new Coffee((long) 2,"Milk Coffee", "Kaffee mit milch"));
	
		return coffeeList;
	}
	
}
