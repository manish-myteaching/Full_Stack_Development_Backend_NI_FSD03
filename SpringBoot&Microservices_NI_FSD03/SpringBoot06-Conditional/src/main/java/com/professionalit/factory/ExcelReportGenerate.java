package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.professionalit.dao.ReportGenerateDAO;


public class ExcelReportGenerate implements ReportGenerate {
	
	@Autowired
	private ReportGenerateDAO reportGenerateDAO;

	public ExcelReportGenerate() {
		System.out.println("ExcelReportGenerate Object Created..!");
	}


	public void generateReport() {
		System.out.println("Generate ExcelReport");
		reportGenerateDAO.generateReport();

	}

}
