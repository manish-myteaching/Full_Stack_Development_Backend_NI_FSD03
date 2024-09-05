package com.professionalit.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class DatabaseMigrationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Check if 'db' option is provided
		if (args.containsOption("db")) {
			// Get the value for the 'db' option
			String dbValue = args.getOptionValues("db").stream().findFirst().orElse("");

			// Check if the provided value is "oracle"
			if ("oracle".equalsIgnoreCase(dbValue)) {
				System.out.println("Oracle Database detected.");
			} else {
				System.out.println("Database type: " + dbValue);
			}
		} else {
			System.out.println("No database type provided.");
		}

	}
}
