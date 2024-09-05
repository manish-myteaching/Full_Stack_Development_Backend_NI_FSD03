package com.professionalit.runner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class ConfigFileRunner implements CommandLineRunner {

	@Value("classpath:cache-config.properties")
	private Resource resource;

	@Autowired
	private  ResourceLoader resourceLoader;

	public ConfigFileRunner(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ConfigFileRunner");
		if (resource.exists()) {
			System.out.println("Configuration file exists: " + resource.getFilename());
			resourceLoader.getResource(resource.getFilename());
	        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        }
		
		} else {
			System.out.println("Configuration file not found: " + resource.getFilename());
		}

	}

}
