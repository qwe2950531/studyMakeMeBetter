package com.yuntu.basis_learn.design_parttern.flyWeight;

import lombok.Data;

@Data
public class SelfPlayingChess implements Chess {
	private String name;
	@Override
	public void setPosition(Position position) {
		System.out.println("将"+name+"放到:"+position.getX()+"---"+position.getY());
	}

	public SelfPlayingChess(String name) {
		this.name = name;
	}

	public SelfPlayingChess() {
	}
}
