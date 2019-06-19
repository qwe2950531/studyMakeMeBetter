package com.yuntu.basis_learn.design_parttern.facade;

import com.yuntu.basis_learn.design_parttern.facade.impl.*;

public class FacadeTest {
	public static void main(String[] args) {
		//使用门面模式之前
//		Bank bank = new BankImpl();
//		BusinessBureau businessBureau = new BusinessBureauImpl();
//		QualityInspection qualityInspection = new QualityInspectionImpl();
//		TaxBureau taxBureau = new TaxBureauImpl();
//
//		businessBureau.getName();
//		bank.createCount();
//		taxBureau.taxCertificate();
//		qualityInspection.orgCodeCertificate();

		// 使用门面模式之后
		Miss miss = new MissImpl();
		miss.registerCompany();


	}
}
