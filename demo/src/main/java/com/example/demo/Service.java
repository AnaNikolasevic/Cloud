package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Repository repository;
	
	public int getAndCount() {
		Counter counter;
		if(repository.findById((long) 0).orElse(null)==null) {
			counter = new Counter();
			counter.setId((long) 0);
			counter.setCountingNumber(0);
		} else {
			counter = repository.getOne((long) 0);
		}
		
		counter.setCountingNumber(counter.getCountingNumber()+1);
		repository.save(counter);
		return counter.getCountingNumber();
	}
}
