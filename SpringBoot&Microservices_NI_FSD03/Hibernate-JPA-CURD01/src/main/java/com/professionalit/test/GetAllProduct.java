package com.professionalit.test;

import java.util.List;

import com.professionalit.dao.ProductDao;
import com.professionalit.entity.Product;

public class GetAllProduct {

	public static void main(String[] args) {
		ProductDao productDao = new ProductDao();
		// Read all users
		List<Product> products = productDao.getAllProduct();
		System.out.println("All users:");
		for (Product product : products) {
			System.out.println(product.getId() + ": " + product.getName() + " - " + product.getPrice());
		}

	}

}
