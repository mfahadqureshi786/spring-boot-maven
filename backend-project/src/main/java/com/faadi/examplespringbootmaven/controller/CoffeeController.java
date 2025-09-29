package com.faadi.examplespringbootmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faadi.examplespringbootmaven.entity.Coffee;
import com.faadi.examplespringbootmaven.service.CoffeeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/coffee")
public class CoffeeController {

	@Autowired
	private CoffeeService coffeeService;
	


	@GetMapping("/all")
	public List<Coffee> getAll(){
		return coffeeService.findAll();
	}
	
}
