package com.yuntu.basis_learn.design_parttern.facade.impl;

import com.yuntu.basis_learn.design_parttern.facade.*;
import lombok.Data;

@Data
public class MissImpl implements Miss {
	Bank bank = new BankImpl();
	BusinessBureau businessBureau = new BusinessBureauImpl();
	QualityInspection qualityInspection = new QualityInspectionImpl();
	TaxBureau taxBureau = new TaxBureauImpl();
	@Override
	public void registerCompany() {
		bank.createCount();
		businessBureau.getName();
		qualityInspection.orgCodeCertificate();
		taxBureau.taxCertificate();
	}
}
