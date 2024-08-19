package com.professionalit.bean;

public class DieselEngine implements Engine {
	public DieselEngine() {	
		System.out.println("Diesel Object Created");
	} 

	@Override
	public int start() {
		System.out.println("Deseal Engine");
		return 1;
	}

}
