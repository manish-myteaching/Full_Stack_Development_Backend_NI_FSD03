package com.professionalit.util;

import org.springframework.beans.factory.annotation.Value;

public class RedisCacheUtil {

	@Value("${cache.type}")
	private String cacheType;

	public RedisCacheUtil() {
		System.out.println("RedisCacheUtil " + "CacheType: " + cacheType + " Object is Created..!");
	}

	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}

}
