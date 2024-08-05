package com.barclays.service;

import com.barclays.dao.RegistrationDAO;
import com.barclays.dao.RegistrationDAOImpl;
import com.barclays.dto.UserInfoDTO;
import com.barclays.util.EmailUtil;
import com.barclays.util.MessageUtil;
import com.barclays.vo.UserInfoVO;

public class RegistrationServiceImpl implements RegistrationService {
	public static RegistrationService INSTANCE = null;

	private RegistrationServiceImpl() {

	}

	public synchronized static RegistrationService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new RegistrationServiceImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}

	@Override
	public UserInfoVO registerUserInfo(UserInfoVO userInfoVO) {
		// DAO Object Creation
		RegistrationDAO RegistrationImpl = RegistrationDAOImpl.getInstance();
		
		UserInfoDTO userInfoDTO = new UserInfoDTO(userInfoVO.getFirstName(), userInfoVO.getLastName(),
				userInfoVO.getContactNo(), userInfoVO.getGender(), userInfoVO.getCityName(), userInfoVO.getUserName(),
				userInfoVO.getPassword());
		UserInfoDTO userInfo = RegistrationImpl.registerUserInfo(userInfoDTO);
		
		if (userInfo != null) {
			// Message
			Thread mailThread = new Thread(new Runnable() {
				@Override
				public void run() {
					//try {
						//Thread.sleep(5000);
		                 MessageUtil.sendMessage("+91-8983703306",userInfo.getFirstName() + " Register Sucessfully" );
					//} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					//}

				}
			});
			mailThread.start();

			// Mailing
			Thread MessageThread = new Thread(new Runnable() {
				@Override
				public void run() {
					EmailUtil.sendMail("vivekshelke510@gmail.com", "Welcome To Flipkart..!",
							userInfo.getFirstName() + " Register Sucessfully");
			
				}
			});
			MessageThread.start();

			return userInfoVO;
		} else {
			return null;
		}
	}

}
