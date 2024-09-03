package com.professionalit.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev")
public class ReportGenerateMySqlDAOImpl implements ReportGenerateDAO {

	public ReportGenerateMySqlDAOImpl() {
		System.out.println("ReportGenerateMySqlDAOImpl");
	}

	@Override
	public void generateReport() {
		System.out.println("MySql  report generate..!");

	}

}
