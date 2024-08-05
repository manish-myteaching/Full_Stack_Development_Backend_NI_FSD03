package com.barclays.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	public final static String USER = "manishnifsd";
	public final static String PASSWARD = "manishnifsd";
	public final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";

	static {
		try {
			Class.forName(DBUtil.DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(DBUtil.URL, DBUtil.USER, DBUtil.PASSWARD);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return con;
	}

	public static void closeConnection(Connection con, Statement stmt) {
		try {
			if (con != null) {
				con.close();
			}
			if (stmt != null) {
				con.close();
			}
		} catch (SQLException sqlExp) {
			sqlExp.printStackTrace();
		}

	}

	public static void closeConnection(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (con != null) {
				con.close();
			}
			if (stmt != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException sqlExp) {
			sqlExp.printStackTrace();
		}

	}

}
