package com.professionalit.test;

import org.h2.tools.Server;
import com.professionalit.dao.ProductDao;
import com.professionalit.model.Product;

public class InsertProuct {
	public static void main(String[] args) throws InterruptedException {
		ProductDao userDao = new ProductDao();

		Server server;
		try {
			server = Server.createWebServer("-web", "-webAllowOthers", "-webDaemon").start();
			System.out.println("H2 Console started at: " + server.getURL());

			// Create a new user
			Product product = new Product();
			// newUser.setId(111);
			product.setName("Cookies");
			product.setPrice(2000.00);
			product.setQuantity(2);
			userDao.createUser(product);
			System.out.println("User created with ID: " + product.getId());
			Thread.sleep(500000);
		} catch (Exception e) {
			//Thread.sleep(500000);
			e.printStackTrace();
		}
	}
}
