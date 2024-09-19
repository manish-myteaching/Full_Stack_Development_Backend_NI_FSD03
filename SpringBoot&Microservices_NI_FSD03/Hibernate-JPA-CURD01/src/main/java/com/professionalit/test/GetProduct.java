package com.professionalit.test;

import com.professionalit.dao.ProductDao;
import com.professionalit.model.Product;

public class GetProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDao productDao = new ProductDao();
		Product product=productDao.getProduct(1L);
		System.out.println(product);

	}

}
