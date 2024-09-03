package com.professionalit.util;

import org.springframework.stereotype.Component;

@Component
public class PasswordUtil {

	public PasswordUtil() {
		System.out.println("PasswordUtil Object Created..!");
	}

	public void passwordEncrypted() {
		System.out.println("Password Encrypted");
	}

}
