package com.tcs.util;

import java.util.Random;

public class ApplicationUtil {
	public static Random random = new Random();

	public static int getRandomNumber(int min, int max) {
		return random.nextInt(max - min + 1) + min;
	}

	public static String getEmpString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

}
