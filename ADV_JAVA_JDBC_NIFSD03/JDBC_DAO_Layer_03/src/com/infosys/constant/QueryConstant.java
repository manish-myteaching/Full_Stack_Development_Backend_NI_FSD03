package com.infosys.constant;

public class QueryConstant {

	public final static StringBuilder INSERT_EMP = new StringBuilder("INSERT INTO EMPLOYEE  VALUES(?,?,? )");

	public final static StringBuilder UPDATE_EMP = new StringBuilder("UPDATE EMPLOYEE  SET EMP_SALARY=EMP_SALARY+? WHERE EMP_ID=?");

	public final static StringBuilder DELETE_EMP = new StringBuilder("DELETE EMPLOYEE  WHERE EMP_ID=?");

	public final static StringBuilder SELECT_EMP = new StringBuilder("SELECT * FROM EMPLOYEE WHERE EMP_ID=?");

	public final static StringBuilder SELECT_ALL_EMP = new StringBuilder("SELECT * FROM EMPLOYEE");

}
