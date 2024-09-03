package com.professionalit.dao;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class UserMySQLImpl implements UserDAO {

	public UserMySQLImpl() {
		System.out.println("UserMySQLImpl object Created...!");
	}

	@Override
	public void getUserDetails() {
		System.out.println("UserMySQLImpl: get details from MYSQL DB");
	}

}
