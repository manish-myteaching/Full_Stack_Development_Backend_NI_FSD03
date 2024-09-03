package com.professionalit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import com.professionalit.config.DatabaseConfig;
import com.professionalit.config.MultipalPropertyConfig;

@Repository
public class DataBaseDAO {

	@Autowired
	DatabaseConfig databaseConfig;

	@Autowired
	MultipalPropertyConfig multipalPropertyConfig;

	@Autowired
	Environment env;

	public void printProperties() {
		System.out.println(databaseConfig.getJdbcUrl());
		System.out.println(databaseConfig.getJdbcUsername());
		System.out.println(databaseConfig.getJdbcPassword());
		
		System.out.println(databaseConfig.getList());

		System.out.println(env.getProperty("myapp.custom.property"));

		System.out.println(multipalPropertyConfig.getFooProperties());
		System.out.println(multipalPropertyConfig.getBarProperties());
	}

}
