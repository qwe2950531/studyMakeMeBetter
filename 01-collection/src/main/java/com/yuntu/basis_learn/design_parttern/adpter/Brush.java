package com.yuntu.basis_learn.design_parttern.adpter;

/**
 * @author wang_lei
 * 刷子 打印的实现类
 */
public class Brush implements Printer {
	@Override
	public void print() {
		System.out.println("用刷子画画");
	}
}
