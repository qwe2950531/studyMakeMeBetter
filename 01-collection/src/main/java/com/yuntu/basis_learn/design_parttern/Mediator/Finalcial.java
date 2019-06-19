package com.yuntu.basis_learn.design_parttern.Mediator;

import lombok.Data;

@Data
public class Finalcial implements Department{
	private President president;
	private boolean haveTime = false;
	public Finalcial(President president){
		this.president = president;
		president.register("finalcial",this);
	}

	@Override
	public void selfAction() {
		System.out.println("会计工作");
	}

	@Override
	public void outAction() {
		System.out.println("想开发一个财务软件");
		president.commond("development");
	}
}
