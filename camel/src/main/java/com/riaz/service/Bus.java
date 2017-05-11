package com.riaz.service;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {

	public void move(){
		System.out.println("Bus is moving..");
	}
}
