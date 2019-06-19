package com.yuntu.basis_learn.design_parttern.factory.MethodFactory;

/**
 * @author wang_lei
 * 奔驰工厂
 */
public class BenzFactory implements CarFactory{
	@Override
	public Car createCar() {
		return new Benz();
	}
}
