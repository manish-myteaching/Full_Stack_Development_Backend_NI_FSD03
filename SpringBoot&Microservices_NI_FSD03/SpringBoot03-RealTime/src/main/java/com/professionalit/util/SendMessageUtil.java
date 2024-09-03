package com.professionalit.util;

import org.springframework.stereotype.Component;

@Component
public class SendMessageUtil {

	public SendMessageUtil() {
		System.out.println("SendMessageUtil Object Created..!");
	}
	
	public void sendMessage() {
		System.out.println("Send Message");
	}

}
