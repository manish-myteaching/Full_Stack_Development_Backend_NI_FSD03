package com.professionalit.bean;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("Petrol Object Created");
	}

	public int start() {
		System.out.println("Petrol Engine");
		return 1;
	}

}
