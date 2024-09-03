package com.professionalit.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod")
public class ReportGenerateOracleDAOImpl implements ReportGenerateDAO {

	public ReportGenerateOracleDAOImpl() {
		System.out.println("ReportGenerateOracleDAOImpl");
	}

	@Override
	public void generateReport() {
		System.out.println("oracle  report generate..!");
	}

}
