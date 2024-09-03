package com.professionalit.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.professionalit.util.EmailServiceUtil;
import com.professionalit.util.MessageServiceUtil;

@Configuration
public class NotificationConfig {

	@Bean
	@ConditionalOnExpression("T(org.springframework.util.StringUtils).commaDelimitedListToSet('${notification.type}').contains('email')")
	EmailServiceUtil getEmailNotification() {
		return new EmailServiceUtil();
	}

	@Bean
	@ConditionalOnExpression("T(org.springframework.util.StringUtils).commaDelimitedListToSet('${notification.type}').contains('message')")
	MessageServiceUtil getMessageNotification() {
		return new MessageServiceUtil();
	}

}
