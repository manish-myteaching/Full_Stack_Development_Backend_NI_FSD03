package com.barclays.constant;

public class QueryConstant {

	public final static StringBuilder INSERT_USER_INFO = new StringBuilder(
			"INSERT INTO EMP_REGISTRATION_INFO  VALUES(?,?,?,?,?,?,? )");
	
	public final static StringBuilder INSERT_USER_LOGIN_INFO = new StringBuilder(
			"INSERT INTO EMP_LOGIN  VALUES(?,?)");

}
