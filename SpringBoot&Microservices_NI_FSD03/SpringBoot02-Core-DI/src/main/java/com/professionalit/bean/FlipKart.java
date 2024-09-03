package com.professionalit.bean;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public class FlipKart {

	@Autowired
	@Qualifier("fedEx")
	private Courier courier;

	public String shopping(String[] items, float[] price) {
		float billAmount = 0;
		for (float f : price) {
			billAmount = billAmount + f;
		}
		int id = new Random().nextInt(1000);
		return "Product " + Arrays.toString(items) + "  With Price " + Arrays.toString(price) + "Total Ammount "
				+ billAmount + courier.deliver(id);
	}
}
