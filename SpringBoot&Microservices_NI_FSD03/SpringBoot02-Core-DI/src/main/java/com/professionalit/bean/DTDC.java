package com.professionalit.bean;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC");
	}

	@Override
	public String deliver(int oid) {
		return "Delivering " + oid + " order Id  order products using DTDC ";
	}

}
