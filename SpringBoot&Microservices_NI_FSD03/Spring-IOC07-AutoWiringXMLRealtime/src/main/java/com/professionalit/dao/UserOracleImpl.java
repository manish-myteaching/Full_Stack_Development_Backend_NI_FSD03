package com.professionalit.dao;

public class UserOracleImpl implements UserDAO {

	public UserOracleImpl() {
		System.out.println("UserOracleImpl object Created...!");
	}

	@Override
	public void getUserDetails() {
		System.out.println("UserOracleImpl: get details from Oracle DB");
	}
}