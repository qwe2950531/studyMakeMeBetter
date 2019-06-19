package com.yuntu.basis_learn.design_parttern.builder;

import lombok.Data;

/**
 * @author 组装着
 */
@Data
public class AirshipDirector {
	private AirshipBuilder airshipBuilder;

	public AirshipDirector(AirshipBuilder airshipBuilder){
		this.airshipBuilder = airshipBuilder;
	}
	public AirShip directAirship(){
		Engine engine = airshipBuilder.buildEngine();
		Head head = airshipBuilder.buildHead();
		Escape escape = airshipBuilder.buildEscape();
		AirShip airShip = new AirShip();
		airShip.setEngine(engine);
		airShip.setEscape(escape);
		airShip.setHead(head);
		return airShip;
	}
}
