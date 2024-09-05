package com.professionalit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(15)
public class AlertRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		if (args.length > 0) {
			String command = args[0];
			switch (command) {
			case "alert":
				if (args.length >= 1) {
					System.out.println("Alert Runner..!");
				} else {
					System.out.println("No Alert Runner..!");
				}
				break;
			default:
				System.out.println("Unknown command.");
				break;
			}
		} else {
			System.out.println("No command provided.");
		}
	}

}
