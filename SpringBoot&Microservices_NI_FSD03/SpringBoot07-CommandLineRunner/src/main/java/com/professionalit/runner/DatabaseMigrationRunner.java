package com.professionalit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DatabaseMigrationRunner implements CommandLineRunner {

	@Override
	@Profile("prod")
	public void run(String... args) throws Exception {
		System.out.println("DatabaseMigrationRunner..!");
	}
}
