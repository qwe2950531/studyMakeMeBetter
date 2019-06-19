package com.yuntu.basis_learn.design_parttern.stata;

public class Case {
	private CaseStatus caseStatus;

	public Case(CaseStatus caseStatus){
		caseStatus=caseStatus;
		caseStatus.setaCase(this);
	}
	public void register(){
		caseStatus.register();
	}

	public void app(){
		caseStatus.app();
	}

	public void finish(){
		caseStatus.finish();
	}
	public void setCaseStatus(CaseStatus caseStatus){
		this.caseStatus = caseStatus;
		this.caseStatus.setaCase(this);
	}
}
