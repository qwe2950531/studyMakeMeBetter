package com.yuntu.basis_learn.design_parttern.command;

public class LightUpCommand  implements Command{
	private Light light;
	public LightUpCommand(Light light){
		this.light = light;
	}
	@Override
	public void Excute() {
		light.lightUp();
	}
}
