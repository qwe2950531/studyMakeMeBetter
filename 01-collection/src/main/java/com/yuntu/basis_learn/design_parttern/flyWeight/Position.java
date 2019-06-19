package com.yuntu.basis_learn.design_parttern.flyWeight;

import lombok.Data;

@Data
public class Position {
	int x;
	int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Position() {
	}
}
