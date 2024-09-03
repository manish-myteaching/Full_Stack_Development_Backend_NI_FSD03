package com.professionalit.util;

public class EmailServiceUtil {

	public EmailServiceUtil() {
		System.out.println("Email Service Object Creation..!");
	}

	public void sendEmail(String from, String to, String message) {
		System.out.println("Send Mail: " + from + " " + to + " " + message );

	}

}
