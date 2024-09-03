package com.professionalit.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.professionalit.factory.ExcelReportGenerate;
import com.professionalit.factory.PdfReportGenerate;
import com.professionalit.factory.TextReportGenerate;

@Configuration
@PropertySource("classpath:cache-config.properties")
public class AppConfig {

	@Bean("excel")
	@ConditionalOnExpression("T(org.springframework.util.StringUtils).commaDelimitedListToSet('${report.type}').contains('excel')")
	ExcelReportGenerate getExcelBean() {
		return new ExcelReportGenerate();

	}

	@Bean("pdf")
	@ConditionalOnExpression("T(org.springframework.util.StringUtils).commaDelimitedListToSet('${report.type}').contains('pdf')")
	PdfReportGenerate getPdfBean() {
		return new PdfReportGenerate();
	}

	@Bean("text")
	@ConditionalOnProperty(name = "report.type", havingValue = "text")
	TextReportGenerate getTextBean() {
		return new TextReportGenerate();
	}

}
