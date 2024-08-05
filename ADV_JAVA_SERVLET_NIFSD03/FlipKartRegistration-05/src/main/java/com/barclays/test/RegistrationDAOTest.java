package com.barclays.test;

import com.barclays.dao.RegistrationDAO;
import com.barclays.dao.RegistrationDAOImpl;
import com.barclays.dto.UserInfoDTO;

public class RegistrationDAOTest {

	public static void main(String[] args) {
		// RegistrationImpl RegistrationImpl = new RegistrationImpl();
		RegistrationDAO RegistrationImpl = RegistrationDAOImpl.getInstance();
		UserInfoDTO userInfoDTO = new UserInfoDTO("Sachin", "Tendulakar", "+43-782343345", "M", "Mumbai", "Sachin01",
				"5676");
		UserInfoDTO userInfo = RegistrationImpl.registerUserInfo(userInfoDTO);
		if (userInfo != null) {
			System.out.println(userInfo.getFirstName() + " Inserted Successfully..!");
		} else {
			System.out.println("User Not Inserted Successfully..Please try Again..!");
		}
	}
}
