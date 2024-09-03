package com.professionalit.factory;

import org.springframework.stereotype.Component;

@Component
public class ExcelReportGenerate implements ReportGenerate {

	public ExcelReportGenerate() {
		System.out.println("ExcelReportGenerate Object Created..!");
	}


	public void generateReport() {
		System.out.println("Generate ExcelReport");

	}

}
