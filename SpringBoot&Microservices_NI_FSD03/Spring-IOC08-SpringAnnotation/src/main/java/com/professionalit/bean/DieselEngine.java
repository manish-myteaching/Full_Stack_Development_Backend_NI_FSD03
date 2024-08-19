package com.professionalit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dieselEngine")
@Primary
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
