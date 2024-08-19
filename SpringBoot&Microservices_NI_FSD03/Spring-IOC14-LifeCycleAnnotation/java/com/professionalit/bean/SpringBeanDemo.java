package com.professionalit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBeanDemo {

	public SpringBeanDemo() {
		System.out.println("Spring Bean Object Created..!");
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	public void show() {
		System.out.println("Show-Business Logic");
	}

	
	public void display() {
		System.out.println("Display-Business Logic");
	}

	@PreDestroy
	public void destory() {
		System.out.println("destroy");
	}

}
