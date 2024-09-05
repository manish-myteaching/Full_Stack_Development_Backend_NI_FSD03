package com.professionalit.runner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.professionalit.service.EmployeeService;

@Component
@Profile("prod")
public class ConfigFileRunner implements ApplicationRunner {

	@Value("classpath:cache-config.properties")
	private Resource resource;

	@Autowired
	private ResourceLoader resourceLoader;
	
	@Autowired
	EmployeeService employeeService;

	public ConfigFileRunner(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ConfigFileRunner");
		if (resource.exists()) {
			System.out.println("Configuration file exists: " + resource.getFilename());
			resourceLoader.getResource(resource.getFilename());
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
					System.out.println(employeeService.findById(1L));
					System.out.println(employeeService.findById(2L));
				}
			}
		} else {
			System.out.println("Configuration file not found: " + resource.getFilename());
		}
	}

}
