package com.infosys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.infosys.constant.QueryConstant;
import com.tcs.dto.Employee;
import com.tcs.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean createEmployeeDeatail(Employee emp) {
		PreparedStatement pStmt = null;
		Connection con = null;

		boolean b = false;
		try {
			con = DBUtil.getConnection();
			con.setAutoCommit(false);
			pStmt = con.prepareStatement(QueryConstant.INSERT_EMP.toString()); // Compile the query at database side
			pStmt.setLong(1, emp.getEmpId());
			pStmt.setString(2, emp.getEmpName());
			pStmt.setDouble(3, emp.getEmpSalary());
			System.out.println(pStmt.getClass().getName());
			int i = pStmt.executeUpdate();
			if (i > 0) {
				b = true;
				con.commit();
				return b;
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return b;
		} finally {
			DBUtil.closeConnection(con, pStmt);
		}

		return b;
	}

	@Override
	public boolean modifyEmployeeDeatail(Employee emp) {
		boolean b = false;
		PreparedStatement pStmt = null;
		Connection con = DBUtil.getConnection();
		try {
			pStmt = con.prepareStatement(QueryConstant.UPDATE_EMP.toString());
			pStmt.setDouble(1, emp.getEmpSalary());
			pStmt.setLong(2, emp.getEmpId());
			int i = pStmt.executeUpdate();
			if (i > 0) {
				b = true;
				return b;
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
			return b;
		} finally {
			DBUtil.closeConnection(con, pStmt);
		}

		return b;
	}

	@Override
	public boolean deleteEmployeeDeatail(Long empId) {

		PreparedStatement pStmt = null;
		Connection con = DBUtil.getConnection();
		boolean b = false;
		try {
			con = DBUtil.getConnection();
			pStmt = con.prepareStatement(QueryConstant.DELETE_EMP.toString());
			pStmt.setLong(1, empId);
			int i = pStmt.executeUpdate();
			if (i > 0) {
				b = true;
				return b;
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
			return b;
		} finally {
			DBUtil.closeConnection(con, pStmt);
		}

		return b;
	}

	@Override
	public Employee getEmployeeDeatail(Long empId) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		Employee emp = null;
		try {
			con = DBUtil.getConnection();
			pStmt = con.prepareStatement(QueryConstant.SELECT_EMP.toString());
			pStmt.setLong(1, empId);
			rs = pStmt.executeQuery();
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
			DBUtil.closeConnection(con, pStmt, rs);
		}
		return emp;
	}

	@Override
	public List<Employee> getAllEmployeeDeatail() {
		PreparedStatement pStmt = null;
		Connection con = null;
		ResultSet rs = null;
		List<Employee> empList = new ArrayList<Employee>();
		try {
			con = DBUtil.getConnection();
			pStmt = con.prepareStatement(QueryConstant.SELECT_ALL_EMP.toString());
			rs = pStmt.executeQuery();
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
			DBUtil.closeConnection(con, pStmt, rs);
		}
		return empList;
	}

}
