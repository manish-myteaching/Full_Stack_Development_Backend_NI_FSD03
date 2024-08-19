package com.professionalit.bean;

public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("Petrol Object Created");
	}

	public int start() {
		System.out.println("Petrol Engine");
		return 1;
	}

}
