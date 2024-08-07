
package com.barclays.util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class MessageUtil {

	// Find your Account Sid and Token at console.twilio.com
	public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXXXXXXXXX";//create your account and put 
	public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXXXXXXXXXX";//create your account and put 
	public static final String TWILIO_NUMBER = "XXXXXXXXXX";

	public static void sendMessage(String toNumber, String toMessage) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		Message message = Message.creator(new PhoneNumber(toNumber), new PhoneNumber("+19784044797"), toMessage)
				.create();

		System.out.println(message.getSid());
	}
}
