package com.professionalit.runner;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-5)
public class ReadArgument implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunner Arguments....");
		for (String arg : args.getSourceArgs()) {
			System.out.println(arg);
		}

		System.out.println("Non-option arguments:");
		List<String> nonOptionalList = args.getNonOptionArgs();
		for (String nonOptArgs : nonOptionalList) {
			System.out.println(nonOptArgs);
		}

		System.out.println("Option arguments:");
		for (String optArgName : args.getOptionNames()) {
			System.out.println(optArgName + " : " + args.getOptionValues(optArgName));
		}

	}

}
