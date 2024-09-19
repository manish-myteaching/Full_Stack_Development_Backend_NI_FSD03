package com.professionalit.test;

import com.professionalit.dao.ProductDao;
import com.professionalit.model.Product;

public class DeleteProduct {

	public static void main(String[] args) {
		ProductDao userDao = new ProductDao();
		Product product = new Product();
		product.setId(111L);
	
	// Delete user
		userDao.deleteProduct(product.getId());
		System.out.println("User deleted");

	}

}
