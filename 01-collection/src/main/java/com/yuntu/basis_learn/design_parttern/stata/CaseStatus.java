package com.yuntu.basis_learn.design_parttern.stata;

public abstract class CaseStatus {
	protected Case aCase;
	public void setaCase(Case aCase){
		this.aCase = aCase;
	}
	abstract void register();
	abstract void app();
	abstract void finish();

}
