package com.yuntu.basis_learn.design_parttern.factory.MethodFactory;

/**
 * @author wang_lei
 * 汽车工厂方法接口
 * 完全的工厂方法模式（完全符合开闭原则） 但是使用起来比较麻烦
 */
public interface CarFactory {

	/**
	 * 创建汽车方法
	 * @return 汽车
	 */
	Car createCar();
}
