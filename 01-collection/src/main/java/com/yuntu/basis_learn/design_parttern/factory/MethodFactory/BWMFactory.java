package com.yuntu.basis_learn.design_parttern.factory.MethodFactory;

/**
 * @author wang_lei
 * 宝马工厂
 */
public class BWMFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new BWM();
	}
}
