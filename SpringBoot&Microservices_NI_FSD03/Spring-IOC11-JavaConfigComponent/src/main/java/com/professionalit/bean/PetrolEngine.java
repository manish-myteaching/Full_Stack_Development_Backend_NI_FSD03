package com.professionalit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrolEngine")
@Primary
public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("Petrol Object Created");
	}

	public int start() {
		System.out.println("Petrol Engine");
		return 1;
	}

}
