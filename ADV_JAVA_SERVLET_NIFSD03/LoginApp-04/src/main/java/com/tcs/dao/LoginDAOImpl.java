package com.tcs.dao;

import java.util.HashMap;
import java.util.Map;

public class LoginDAOImpl {

	public boolean isUserExist(String userName, String userPwd) {
		boolean b = false;
		Map<String, String> map = new HashMap<String, String>();
		map.put("manish", "1234");
		map.put("ramesh", "1234");
		map.put("Alex", "1234");
		map.put("Shyam", "1234");
		
		String pwd = map.get(userName);
		if (pwd != null) {
			if (userPwd.equals(pwd)) {
				b = true;
			}
		}
		return b;
	}

}
