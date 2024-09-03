package com.professionalit.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.professionalit.util.CacheProperties;
import com.professionalit.util.CacheServiceUtil;
import com.professionalit.util.RedisCacheUtil;

@Configuration
public class CacheConfig {

	@Bean
	@ConditionalOnClass(CacheProperties.class)
	CacheServiceUtil cacheService() {
		return new CacheServiceUtil();
	}

	@Bean
	@Conditional(RedisCacheCustomCondition.class)
	@Profile("prod")
	RedisCacheUtil redisCacheService() {
		return new RedisCacheUtil();
	}

}
