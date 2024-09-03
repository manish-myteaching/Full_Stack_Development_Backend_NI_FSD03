package com.professionalit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:foo.properties")
@PropertySource("classpath:bar.properties")
public class MultipalPropertyConfig {

	@Value("${bar.custom.property}")
	private String barProperties;

	@Value("${foo.custom.property}")
	private String fooProperties;

	public String getFooProperties() {
		return fooProperties;
	}

	public String getBarProperties() {
		return barProperties;
	}

}
