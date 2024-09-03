package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.professionalit.bean.FlipKart;

@SpringBootApplication
public class SpringBoot02CoreDIApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBoot02CoreDIApplication.class, args);
		FlipKart flipkart = ctx.getBean("flipkart", FlipKart.class);
		String message = flipkart.shopping(new String[] { "shirt", "trouser", "watch" },
				new float[] { 4000.0f, 6000.0f, 30000.0f });
		System.out.println(message);
	}

}
