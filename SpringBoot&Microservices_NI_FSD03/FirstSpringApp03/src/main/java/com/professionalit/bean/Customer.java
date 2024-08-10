package com.professionalit.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private int customerId; // primitive
	private String customerName; // Reference
	private String contachNumber;

	Address address; // Reference
	List<String> list;
	List<Product> listProduct;// Reference

	public Customer(int customerId, String customerName, String contachNumber, Address address,
			List<Product> listProduct) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contachNumber = contachNumber;
		this.address = address;
		this.listProduct = listProduct;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	// For passing Address At run time // Setter injection
	public void setAddress(Address address) {
		System.out.println("Setter Injection : Pass Address Object");
		this.address = address;
	}

	public void setContachNumber(String contachNumber) {
		this.contachNumber = contachNumber;
	}

	public void getCustomerDetails() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contachNumber="
				+ contachNumber + "]";
	}

}
