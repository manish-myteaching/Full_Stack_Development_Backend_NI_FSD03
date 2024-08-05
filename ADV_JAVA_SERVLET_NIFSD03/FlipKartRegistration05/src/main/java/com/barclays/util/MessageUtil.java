
package com.barclays.util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class MessageUtil {

	// Find your Account Sid and Token at console.twilio.com
	public static final String ACCOUNT_SID = "AC93973e2e946b28438ab1df14385c3a83";
	public static final String AUTH_TOKEN = "28120422c5c5c47d8c0e6a2e2c8e74c5";
	public static final String TWILIO_NUMBER = "+19784044797";

	public static void sendMessage(String toNumber, String toMessage) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(new PhoneNumber(toNumber), new PhoneNumber("+19784044797"), toMessage)
				.create();

		System.out.println(message.getSid());
	}
}
