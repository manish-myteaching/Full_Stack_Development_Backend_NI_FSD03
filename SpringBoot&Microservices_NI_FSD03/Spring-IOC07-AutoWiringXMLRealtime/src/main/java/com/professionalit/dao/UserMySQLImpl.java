package com.professionalit.dao;

public class UserMySQLImpl implements UserDAO {

	public UserMySQLImpl() {
		System.out.println("UserMySQLImpl object Created...!");
	}

	@Override
	public void getUserDetails() {
	System.out.println("UserMySQLImpl: get details from MYSQL DB");	
	}

}
