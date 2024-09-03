package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.professionalit.dao.ReportGenerateDAO;

public class PdfReportGenerate implements ReportGenerate {

	@Autowired
	private ReportGenerateDAO reportGenerateDAO;

	public PdfReportGenerate() {
		System.out.println("Pdf ReportGenerate Object Created..!");
	}

	public void generateReport() {
		System.out.println("Generate PdfReport");
		reportGenerateDAO.generateReport();
	}

}
