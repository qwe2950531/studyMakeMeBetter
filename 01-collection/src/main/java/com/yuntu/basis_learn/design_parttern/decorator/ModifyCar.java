package com.yuntu.basis_learn.design_parttern.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;

public abstract class ModifyCar implements ICar {

	protected ICar iCar;
	public ModifyCar(ICar iCar){
		this.iCar = iCar;
	}
}
