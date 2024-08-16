package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.bean.Address;
import com.professionalit.bean.Customer;

public class CustomerTest {

	public static void main(String... k) {

		// IOC Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"./applicationContext.xml");
		Object obj = applicationContext.getBean("customer");
		Customer customer = (Customer) obj;
		//customer.getCustomerDetails();
		System.out.println("Customer HashCode " + customer.hashCode());

		Object obj1 = applicationContext.getBean("customer");
		Customer customer1 = (Customer) obj1;
		System.out.println("Customer HashCode1 " + customer1.hashCode());
		
		Object obj2 = applicationContext.getBean("customer");
		Customer customer2 = (Customer) obj2;
		System.out.println("Customer HashCode2 " + customer2.hashCode());

		// Address address = (Address) applicationContext.getBean("address");

	}

}
