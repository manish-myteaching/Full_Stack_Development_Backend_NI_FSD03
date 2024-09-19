package com.professionalit.test;

import java.sql.SQLException;

import org.h2.tools.Server;
import com.professionalit.dao.UserDao;
import com.professionalit.model.User;

public class App {
	public static void main(String[] args) throws SQLException, InterruptedException {
		UserDao userDao = new UserDao();

		Server server = Server.createWebServer("-web", "-webAllowOthers", "-webDaemon").start();
		System.out.println("H2 Console started at: " + server.getURL());

		// Create a new user
		User newUser = new User();
		//newUser.setId(111);
		newUser.setName("Rohit");
		newUser.setEmail("Rohit.doe@example.com");
		userDao.saveUser(newUser);
		System.out.println("User created with ID: " + newUser.getId());
		
		Thread.sleep(500000);

		// Read user
//		User user = userDao.getUser(newUser.getId());
//		System.out.println("User retrieved: " + user.getName() + " - " + user.getEmail());
//
//		// Update user
//		user.setEmail("john.doe@newdomain.com");
//		userDao.updateUser(user);
//		System.out.println("User updated");
//
//		// Read all users
//		List<User> users = userDao.getAllUsers();
//		System.out.println("All users:");
//		for (User u : users) {
//			System.out.println(u.getId() + ": " + u.getName() + " - " + u.getEmail());
//		}
//
//		// Delete user
//		userDao.deleteUser(user.getId());
//		System.out.println("User deleted");
	}
}
