package com.professionalit.config;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class RedisCacheCustomCondition extends SpringBootCondition {

	 @Override
	    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
	        Environment environment = context.getEnvironment();
	        String fileName = environment.getProperty("cache.config.file.name");

	        if (fileName == null || fileName.isEmpty()) {
	            return ConditionOutcome.noMatch("Property 'cache.config.file.name' is not set.");
	        }

	        URL resource = context.getClassLoader().getResource(fileName);
	        if (resource != null) {
	            try {
	                File file = new File(resource.toURI());
	                if (file.exists()) {
	                    return ConditionOutcome.match();
	                }
	            } catch (URISyntaxException e) {
	                return ConditionOutcome.noMatch("File URI syntax is incorrect.");
	            }
	        }
	        return ConditionOutcome.noMatch("File not found: " + fileName);
	    }
	}