package com.tcs.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tcs.dto.Employee;
import com.tcs.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean createEmployeeDeatail(Employee emp) {
		boolean b = false;
		Statement stmt = null;
		Connection con = DBUtil.getConnection();
		try {
			stmt = con.createStatement();
			String INSERT_EMP_SQL = "INSERT INTO EMPLOYEE " + "VALUES(" + emp.getEmpId() + "," + "'" + emp.getEmpName()
					+ "'" + "," + emp.getEmpSalary() + ")";
			System.out.println(INSERT_EMP_SQL);
			int i = stmt.executeUpdate(INSERT_EMP_SQL);
			if (i > 0) {
				b = true;
				return b;
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
			return b;
		} finally {
			DBUtil.closeConnection(con, stmt);
		}

		return b;
	}

	@Override
	public boolean modifyEmployeeDeatail(Employee emp) {
		boolean b = false;
		Statement stmt = null;
		Connection con = DBUtil.getConnection();
		try {
			stmt = con.createStatement();
			String UPDATE_EMP_SQL = "UPDATE EMPLOYEE SET EMP_SALARY=EMP_SALARY+" + emp.getEmpSalary() + " WHERE EMP_ID="
					+ emp.getEmpId();
			System.out.println(UPDATE_EMP_SQL);
			int i = stmt.executeUpdate(UPDATE_EMP_SQL);
			if (i > 0) {
				b = true;
				return b;
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
			return b;
		} finally {
			DBUtil.closeConnection(con, stmt);
		}

		return b;
	}

	@Override
	public boolean deleteEmployeeDeatail(Long empId) {
		boolean b = false;
		Statement stmt = null;
		Connection con = DBUtil.getConnection();
		try {
			stmt = con.createStatement();
			String DELETE_EMP_SQL = "DELETE EMPLOYEE WHERE EMP_ID=" + empId;
			System.out.println(DELETE_EMP_SQL);
			int i = stmt.executeUpdate(DELETE_EMP_SQL);
			if (i > 0) {
				b = true;
				return b;
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
			return b;
		} finally {
			DBUtil.closeConnection(con, stmt);
		}

		return b;
	}

	@Override
	public Employee getEmployeeDeatail(Long empId) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Employee emp = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			String GET_EMP_SQL = "SELECT * FROM EMPLOYEE WHERE EMP_ID=" + empId;
			System.out.println(GET_EMP_SQL);
			rs = stmt.executeQuery(GET_EMP_SQL);
			while (rs.next()) {
				emp = new Employee();
				Long empIdd = rs.getLong("EMP_ID"); // rs.getLong(1);
				String empName = rs.getString("EMP_NAME"); // rs.getString(2);
				Double empSal = rs.getDouble("EMP_SALARY");// rs.getDouble(3);
				emp.setEmpId(empIdd);
				emp.setEmpName(empName);
				emp.setEmpSalary(empSal);
			}

		} catch (SQLException sq) {
			sq.printStackTrace();

		} finally {
			DBUtil.closeConnection(con, stmt, rs);
		}
		return emp;
	}

	@Override
	public List<Employee> getAllEmployeeDeatail() {
		Statement stmt = null;
		Connection con = null;
		ResultSet rs=null;
		List<Employee> empList = new ArrayList<Employee>();
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			String GET_ALL_EMP_SQL = "SELECT * FROM EMPLOYEE";
			System.out.println(GET_ALL_EMP_SQL);
			 rs = stmt.executeQuery(GET_ALL_EMP_SQL);
			while (rs.next()) {
				Employee emp = new Employee();
				Long empIdd = rs.getLong("EMP_ID"); // rs.getLong(1);
				String empName = rs.getString("EMP_NAME"); // rs.getString(2);
				Double empSal = rs.getDouble("EMP_SALARY");// rs.getDouble(3);
				emp.setEmpId(empIdd);
				emp.setEmpName(empName);
				emp.setEmpSalary(empSal);
				empList.add(emp);
			}

		} catch (SQLException sq) {
			sq.printStackTrace();

		} finally {
			DBUtil.closeConnection(con, stmt,rs);
		}
		return empList;
	}

}
