package com.yuntu.basis_learn.design_parttern.flyWeight;

public class Player {
	public static void main(String[] args) {
		Chess black = ChessPool.getChess("黑色");
		black.setPosition(new Position(22,11));
		Chess black2 = ChessPool.getChess("白色");
		System.out.println(black==black2);
		black2.setPosition(new Position(23,11));


	}
}
