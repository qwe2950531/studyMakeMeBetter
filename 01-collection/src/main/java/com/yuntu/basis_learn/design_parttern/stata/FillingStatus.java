package com.yuntu.basis_learn.design_parttern.stata;

public class FillingStatus extends CaseStatus {
	@Override
	void register() {
		System.out.println("立案");
		super.aCase.setCaseStatus(new CasingStatus());
	}

	@Override
	void app() {
		System.out.println("案件处于立案中无法申请");
	}

	@Override
	void finish() {
		System.out.println("还在立案 无法结案");
	}
}
