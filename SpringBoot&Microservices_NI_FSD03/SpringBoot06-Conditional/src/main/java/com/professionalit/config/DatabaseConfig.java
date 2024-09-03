package com.professionalit.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.professionalit.util.DatabaseProperties;
import com.professionalit.util.DatabaseUtil;

@Configuration
public class DatabaseConfig {

	@Bean
	DatabaseProperties dataBaseProperties() {
		return new DatabaseProperties();
	}

	@Bean
	@ConditionalOnBean(DatabaseProperties.class)
	DatabaseUtil dataBaseUtil() {
		return new DatabaseUtil();
	}

}
