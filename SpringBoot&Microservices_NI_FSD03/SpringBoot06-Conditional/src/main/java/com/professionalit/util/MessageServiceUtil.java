package com.professionalit.util;

public class MessageServiceUtil {
	public MessageServiceUtil() {
		System.out.println("Message Service Object Creation..!");
	}

	public void sendMessage(String from, String to, String message) {
		System.out.println("Send Message: " + from + " " + to + " " + message );
	}

	public void sendOtp(String from, String to, String message, String otp) {
		System.out.println("Send Message: " + from + " " + to + " " + message + " " + otp );
	}

}
