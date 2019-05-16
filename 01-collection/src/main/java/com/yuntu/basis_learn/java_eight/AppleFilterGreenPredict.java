package com.yuntu.basis_learn.java_eight;

public class AppleFilterGreenPredict implements ApplePredict<Apple> {


	@Override
	public  boolean test(Apple apple) {
		return false;
	}
}
