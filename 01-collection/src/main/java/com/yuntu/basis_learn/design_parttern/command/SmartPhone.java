package com.yuntu.basis_learn.design_parttern.command;

import java.util.List;

public class SmartPhone {
	private Command command;

	public void setCommand(Command command){
		this.command = command;
	}

	public void doCommand(){
		command.Excute();
	}
}
