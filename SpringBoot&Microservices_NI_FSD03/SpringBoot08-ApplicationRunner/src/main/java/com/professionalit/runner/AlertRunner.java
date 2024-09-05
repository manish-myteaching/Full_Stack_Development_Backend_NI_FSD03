package com.professionalit.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(15)
public class AlertRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		if (args.getNonOptionArgs().contains("alert")) {
			System.out.println("AlertRunner Start");
		} else {
			throw new IllegalArgumentException("Required argument 'requiredArg' is missing");
		}

	}

}
