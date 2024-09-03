package com.professionalit.bean;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart");
	}

	@Override
	public String deliver(int oid) {
		return " Delivering " + oid + " order Id  order products using BlueDart ";
	}

}
