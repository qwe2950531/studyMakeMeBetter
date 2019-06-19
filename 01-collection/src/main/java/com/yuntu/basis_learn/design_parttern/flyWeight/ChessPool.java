package com.yuntu.basis_learn.design_parttern.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 棋池
 */
public class ChessPool {
	private static Map<String,Chess> chessPool = new HashMap<String,Chess>();

	public static Chess  getChess(String name){
		if(chessPool.containsKey(name)){
			return chessPool.get(name);
		} else {
			chessPool.put(name,new SelfPlayingChess(name));
		}
		return chessPool.get(name);
	}
}
