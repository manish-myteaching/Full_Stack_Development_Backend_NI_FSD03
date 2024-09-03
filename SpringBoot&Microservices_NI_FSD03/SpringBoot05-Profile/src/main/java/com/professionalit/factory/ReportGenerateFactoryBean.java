package com.professionalit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerateFactoryBean {

	@Autowired
	ApplicationContext applicationContext;

	public ReportGenerate createReportGenerator(String reportType) {
		switch (reportType.toLowerCase()) {
		case "excel":
			return applicationContext.getBean("excelReportGenerate", ExcelReportGenerate.class);
		case "pdf":
			return applicationContext.getBean("pdfReportGenerate", PdfReportGenerate.class);
		default:
			throw new IllegalArgumentException("Unknown report type: " + reportType);
		}
	}

}
