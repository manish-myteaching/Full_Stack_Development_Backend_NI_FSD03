package test;

import com.tcs.dao.LoginDAOImpl;

public class Test {

	public static void main(String[] args) {
		LoginDAOImpl loginDAOImpl = new LoginDAOImpl();

		boolean b = loginDAOImpl.isUserExist("Alex", "1234");
		System.out.println(b);
	}

}
