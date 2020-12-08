package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity(name="counter")
@Table
public class Counter {
	@Id
	private Long id;
	
	@Column(name="countingNumber")
	private int countingNumber;
	
	public Counter() {
		super();
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setCountingNumber(int countingNumber) {
		this.countingNumber = countingNumber;
	}
	
	public int getCountingNumber() {
		return this.countingNumber;
	}
}
