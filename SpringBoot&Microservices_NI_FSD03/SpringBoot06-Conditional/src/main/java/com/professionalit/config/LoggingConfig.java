package com.professionalit.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.professionalit.util.DefaultLogginServiceUtil;
import com.professionalit.util.LoggingServiceUtil;

@Configuration
public class LoggingConfig {

	@Bean
	@ConditionalOnMissingBean(DefaultLogginServiceUtil.class)
	LoggingServiceUtil getLogging() {
		return new LoggingServiceUtil();
	}

}
