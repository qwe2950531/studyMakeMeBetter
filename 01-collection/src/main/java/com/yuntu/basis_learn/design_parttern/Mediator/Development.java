package com.yuntu.basis_learn.design_parttern.Mediator;

import lombok.Data;

@Data
public class Development implements Department {
	private boolean haveTime = true;
	private President president;
	public Development(President president){
		this.president = president;
		president.register("development",this);
	}
	@Override
	public void selfAction() {
		System.out.println("专心研发");

	}

	@Override
	public void outAction() {
		president.commond("finalcial");
		System.out.println("需要申请资金");


	}


}
