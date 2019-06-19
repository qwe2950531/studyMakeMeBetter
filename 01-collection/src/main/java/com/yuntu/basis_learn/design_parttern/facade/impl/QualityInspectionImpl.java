package com.yuntu.basis_learn.design_parttern.facade.impl;

import com.yuntu.basis_learn.design_parttern.facade.QualityInspection;

public class QualityInspectionImpl implements QualityInspection {
	@Override
	public void orgCodeCertificate() {
		System.out.println("质检局注册组织机构代码");
	}
}
