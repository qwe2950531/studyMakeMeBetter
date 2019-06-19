package com.yuntu.basis_learn.design_parttern.adpter;

/**
 * @author wang_lei
 * 笔的实现类 铅笔
 */
public class Pencil implements Pen{
	@Override
	public void write(){
		System.out.println("用铅笔画画");
	}
}
