package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/cloud")
	public int firstMethod() {      
		
		return service.getAndCount();
	}
	
	@GetMapping("/env")
	public String env() {      
		
        return System.getenv("POSTGES_CONNECTION_STING");
        }
}