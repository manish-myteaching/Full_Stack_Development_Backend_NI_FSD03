package com.professionalit.util;

import org.springframework.stereotype.Component;

@Component
public class SendMailUtil {

	public SendMailUtil() {
		System.out.println("SendMailUtil Object Created..!");
	}

	public void sendMessage() {
		System.out.println("Send Mail");
	}

}
