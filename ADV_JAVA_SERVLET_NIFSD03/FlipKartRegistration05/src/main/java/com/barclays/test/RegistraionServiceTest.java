package com.barclays.test;

import com.barclays.service.RegistrationService;
import com.barclays.service.RegistrationServiceImpl;
import com.barclays.vo.UserInfoVO;

public class RegistraionServiceTest {

	public static void main(String[] args) {
		RegistrationService registrationService = RegistrationServiceImpl.getInstance();
		UserInfoVO userInfoVO = new UserInfoVO("Rahul", "Singh", "+43-782843345", "M", "Mumbai", "Rahul01", "5676");

		UserInfoVO userInfoVO1 = registrationService.registerUserInfo(userInfoVO);
		if (userInfoVO1 != null) {
			System.out.println(userInfoVO1.getFirstName() + " Insert Sucessfully");
		} else {
			System.out.println(userInfoVO1.getFirstName() + " is not insert  Sucessfully");
		}

	}

}
