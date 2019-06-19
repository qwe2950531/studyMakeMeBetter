package com.yuntu.basis_learn.design_parttern.factory.SimpleFactory;

/**
 * @author wang_lei
 * 简单工厂模式 实现方法一  通过静态类条件判断返回相应类
 * 不完全的工厂方法模式   但是修改使用起来方便
 */
public class CarFactoryVersonOne {
	public static Car createCar(String type){
		switch (type){
			case "1":
				return new Audi();
			case "2":
				return new Benz();
			case "3":
				return new BWM();
			default: return null;
		}
	}
}
