package com.professionalit.bean;

import java.util.List;

public class Customer2 {
	private int customerId; // primitive
	private String customerName; // Reference
	private String contachNumber;

	Address address; // Reference
	List<Product> listProduct;// Reference

	public Customer2(int customerId, String customerName, String contachNumber, Address address,
			List<Product> listProduct) {
		System.out.println("Constructor - DI");
		this.customerId = customerId;
		this.customerName = customerName;
		this.contachNumber = contachNumber;
		this.address = address;
		this.listProduct = listProduct;
	}

	public Customer2() {
		System.out.println("Customer2");
	}

	public void getCustomerDetails() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Customer2 [customerId=" + customerId + ", customerName=" + customerName + ", contachNumber="
				+ contachNumber + ", address=" + address + ", listProduct=" + listProduct + "]";
	}

}
