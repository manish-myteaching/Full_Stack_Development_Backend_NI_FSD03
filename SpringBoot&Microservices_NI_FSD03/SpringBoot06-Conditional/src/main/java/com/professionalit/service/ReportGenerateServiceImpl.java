package com.professionalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professionalit.factory.ReportGenerateFactoryBean;
import com.professionalit.util.EmailServiceUtil;
import com.professionalit.util.MessageServiceUtil;

@Service
public class ReportGenerateServiceImpl implements ReportGenerateService {

	@Autowired(required = true)
	ReportGenerateFactoryBean reportGenerateFactoryBean;

	@Autowired
	EmailServiceUtil emailServiceUtil;

	@Autowired
	MessageServiceUtil messageServiceUtil;

	@Override
	public void generateReport(String type) {
		reportGenerateFactoryBean.createReportGenerator(type);
		System.out.println(type.toUpperCase() + " Report generate successfully..!");

		if (null != emailServiceUtil) {
			emailServiceUtil.sendEmail("PI", "admin", "Report generate successfully..!");
		}
		if (null != messageServiceUtil) {
			messageServiceUtil.sendMessage("PI", "admin", "Report generate successfully..!");
		}
	}

}
