package com.professionalit.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatabaseConfig {

	@Value("${spring.datasource.url}")
	private String jdbcUrl;

	@Value("${spring.datasource.username}")
	private String jdbcUsername;

	@Value("${spring.datasource.password}")
	private String jdbcPassword;

	@Value("${myapp.env.list}")
	private List<String> list;

	// Getters
	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public String getJdbcUsername() {
		return jdbcUsername;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}

	public List<String> getList() {
		return list;
	}
}
