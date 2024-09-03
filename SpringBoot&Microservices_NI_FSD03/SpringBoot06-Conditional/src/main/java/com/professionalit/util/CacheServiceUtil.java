package com.professionalit.util;

import org.springframework.beans.factory.annotation.Value;

public class CacheServiceUtil {
	@Value("${cache.type}")
	private String cacheType;

	public CacheServiceUtil() {
		System.out.println("Cache Service Object" + " " + "CacheType " + cacheType + " is created..!");
	}

	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}

}
