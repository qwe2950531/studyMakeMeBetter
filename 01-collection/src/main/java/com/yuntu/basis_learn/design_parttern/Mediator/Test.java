package com.yuntu.basis_learn.design_parttern.Mediator;

public class Test {
	public static void main(String[] args) {
		President president = new President();
		Finalcial finalcial = new Finalcial(president);
		Development development = new Development(president);
		finalcial.outAction();
//		development.outAction();
	}
}
