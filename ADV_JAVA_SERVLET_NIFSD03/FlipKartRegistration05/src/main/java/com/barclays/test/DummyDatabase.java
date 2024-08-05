package com.barclays.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.barclays.bean.UserInfo;

public class DummyDatabase {
	private static Map<Integer, UserInfo> userMap = new HashMap<>();
	private static Random random = new Random();

	static {
		String[] firstNameArray = new String[] { "Amit", "Aman", "Shiv", "Kamall", "Ashu", "Shyam", "Krishna", "Rishi",
				"Manish", "Gaurav" };
		String[] lastNameArray = new String[] { "Sharma", "Verma", "Guikwad", "Patel", "Patil", "Singh", "jadhav",
				"yadav", "Rahane", "Thakur" };
		String[] cityNameArray = new String[] { "Pune", "Mumbai", "London", "Indore", "Jaipur", "Peris", "Kolkata",
				"Dehli", "Jammu", "Chandigad" };
		// Generate and add random users
		for (int i = 0; i < 50; i++) {
			// String id = UUID.randomUUID().toString();
			Integer id = random.nextInt(50);
			String firstName = firstNameArray[random.nextInt(10)];
			String lastName = lastNameArray[random.nextInt(10)];
			String contactNumber = "+" + random.nextInt(50) + "3-" + random.nextInt(10) + "824" + random.nextInt(10)
					+ "4344" + random.nextInt(50);
			String city = cityNameArray[random.nextInt(10)];
			String userId = "user" + random.nextInt(50);
			String password = random.nextInt(50) + "" + random.nextInt(50);

			UserInfo user = new UserInfo(firstName, lastName, contactNumber, "M", city, userId, password);
			addUser(id, user);
		}

	}

	public static void addUser(Integer index, UserInfo user) {
		userMap.put(index, user);
	}

	public static UserInfo getUser(Integer id) {
		return userMap.get(id);
	}

	public static void removeUser(Integer id) {
		userMap.remove(id);
	}

	public static Collection<UserInfo> printAllUsers() {
		return userMap.values();
	}

	public static UserInfo getRandomUser() {
		return userMap.get("1");
	}

	public static void main(String[] args) {
		System.out.println(getRandomUser());
	}

}
