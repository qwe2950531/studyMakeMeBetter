package com.yuntu.basis_learn.design_parttern.stata;

public class CasingStatus extends CaseStatus {
	@Override
	void register() {
		System.out.println("已经立案无需再立");
	}

	@Override
	void app() {
		System.out.println("");
	}

	@Override
	void finish() {

	}
}
