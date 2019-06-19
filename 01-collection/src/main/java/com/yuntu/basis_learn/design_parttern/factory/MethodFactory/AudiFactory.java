package com.yuntu.basis_learn.design_parttern.factory.MethodFactory;

/**
 * @author wang_lei
 *  奥迪工厂
 */
public class AudiFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Audi();
	}
}
