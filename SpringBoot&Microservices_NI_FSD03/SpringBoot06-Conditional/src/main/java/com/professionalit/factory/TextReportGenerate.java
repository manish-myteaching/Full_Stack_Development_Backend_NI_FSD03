package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.professionalit.dao.ReportGenerateDAO;

public class TextReportGenerate implements ReportGenerate {

	@Autowired
	private ReportGenerateDAO reportGenerateDAO;

	public TextReportGenerate() {
		System.out.println("TextReportGenerate Object Created..!");
	}

	public void generateReport() {
		System.out.println("Generate TextReport..!");
		reportGenerateDAO.generateReport();
	}
}
