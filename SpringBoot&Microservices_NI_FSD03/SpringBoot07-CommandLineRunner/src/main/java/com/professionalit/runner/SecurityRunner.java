package com.professionalit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecurityRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SecurityRunner Start");
	}
}
