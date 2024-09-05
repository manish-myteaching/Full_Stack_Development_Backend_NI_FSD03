package com.professionalit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReadArgument implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		if (args.length > 0) {
			for (String arg : args) {
				System.out.println("Argument: " + arg);
			}

		}
	}
}
