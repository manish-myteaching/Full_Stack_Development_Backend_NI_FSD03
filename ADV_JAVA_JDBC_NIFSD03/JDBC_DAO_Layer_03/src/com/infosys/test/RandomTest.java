package com.infosys.test;

import java.util.Random;

public class RandomTest {
	static  String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	public static void main(String... k) {
		int min = 101; // Minimum value
		int max = 110; // Maximum value

		Random rand = new Random();
//		while (true) {
//			int randomNumber = rand.nextInt(max - min + 1) + min;
//			System.out.println(randomNumber);
//		}
		
		System.out.println(getSaltString());
	}
}
