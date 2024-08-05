package com.barclays.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.barclays.constant.QueryConstant;
import com.barclays.dto.UserInfoDTO;
import com.barclays.util.DBUtil;

public class RegistrationDAOImpl implements RegistrationDAO {

	public static RegistrationDAO INSTANCE = null;

	private RegistrationDAOImpl() {

	}

	public synchronized static RegistrationDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new RegistrationDAOImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}

	@Override
	public UserInfoDTO registerUserInfo(UserInfoDTO userInfoDTO) {
		PreparedStatement pStmtRegistration = null;
		PreparedStatement pStmtLogin = null;
		Connection con = null;

		try {
			con = DBUtil.getConnection();
			con.setAutoCommit(false);
			pStmtRegistration = con.prepareStatement(QueryConstant.INSERT_USER_INFO.toString());
			pStmtLogin = con.prepareStatement(QueryConstant.INSERT_USER_LOGIN_INFO.toString());

			// Table-1
			pStmtRegistration.setString(1, userInfoDTO.getFirstName());
			pStmtRegistration.setString(2, userInfoDTO.getLastName());
			pStmtRegistration.setString(3, userInfoDTO.getContactNo());
			pStmtRegistration.setString(4, userInfoDTO.getCityName());
			pStmtRegistration.setString(5, userInfoDTO.getUserName());
			pStmtRegistration.setString(6, userInfoDTO.getPassword());
			pStmtRegistration.setString(7, userInfoDTO.getGender());
			int i = pStmtRegistration.executeUpdate();

			// Table-2
			pStmtLogin.setString(1, userInfoDTO.getUserName());
			pStmtLogin.setString(2, userInfoDTO.getPassword());
			int j = pStmtLogin.executeUpdate();

			if (i > 0 && j > 0) {
				con.commit();
				return userInfoDTO;
			}
		} catch (SQLException sq) {
			sq.printStackTrace();
			//System.out.println(sq.getMessage());
			try {
				con.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		} finally {
			DBUtil.closeConnection(con, pStmtRegistration);
			DBUtil.closeConnection(con, pStmtLogin);
		}
		return null;
	}
}
