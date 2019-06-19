package com.yuntu.basis_learn.design_parttern.builder;

import lombok.Data;

/**
 * @author wang_lei
 * 宇宙飞船
 */
@Data
public class AirShip {
	private Head head;
	private Engine engine;
	private Escape escape;
}
@Data
class Head{
	private String head;

	public Head(String head) {
		this.head = head;
	}
}
@Data
class Escape{


	private String Escape;
	public Escape(String escape) {
		Escape = escape;
	}
}
@Data
class Engine{
	private String Engine;

	public Engine(String engine) {
		Engine = engine;
	}
}
