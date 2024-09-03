package com.professionalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professionalit.factory.ReportGenerateFactoryBean;

@Service
public class ReportGenerateServiceImpl implements ReportGenerateService {

	@Autowired
	ReportGenerateFactoryBean reportGenerateFactoryBean;

	@Override
	public void generateReport(String type) {
		reportGenerateFactoryBean.createReportGenerator(type);
		System.out.println(type.toUpperCase() + " Report generate successfully..!");
	}

}
