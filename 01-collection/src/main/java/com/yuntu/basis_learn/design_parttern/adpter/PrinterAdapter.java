package com.yuntu.basis_learn.design_parttern.adpter;

/**
 * @author 适配器
 * 也可以使用继承！
 */
public class PrinterAdapter  implements Printer{

	/**
	 * 	尽量组合 不去继承
 	 */
	Pencil pencil = new Pencil();
	@Override
	public void print() {
		pencil.write();
	}
}
