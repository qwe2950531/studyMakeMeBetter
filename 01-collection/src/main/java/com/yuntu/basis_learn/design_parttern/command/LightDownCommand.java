package com.yuntu.basis_learn.design_parttern.command;

public class LightDownCommand implements Command {
	private Light light;
	public LightDownCommand(Light light){
		this.light = light;
	}
	@Override
	public void Excute() {
		light.lightDown();
	}
}
