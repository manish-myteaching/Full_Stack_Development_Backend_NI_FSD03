package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.professionalit.service.ReportGenerateService;
import com.professionalit.service.ReportGenerateServiceImpl;

@SpringBootApplication
public class SpringBoot06ConditionalApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringBoot06ConditionalApplication.class, args);
		ReportGenerateService rs = applicationContext.getBean("reportGenerateServiceImpl",
				ReportGenerateServiceImpl.class);
		rs.generateReport("pdf");
	}

}
