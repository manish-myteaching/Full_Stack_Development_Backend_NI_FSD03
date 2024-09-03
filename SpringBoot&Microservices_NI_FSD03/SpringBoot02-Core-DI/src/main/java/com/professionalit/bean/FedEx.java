package com.professionalit.bean;

import org.springframework.stereotype.Component;

@Component("fedEx")
public class FedEx implements Courier {

	public FedEx() {
		System.out.println("FedEx");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering " + oid + " order Id  order products using FedEx ";
	}

}
