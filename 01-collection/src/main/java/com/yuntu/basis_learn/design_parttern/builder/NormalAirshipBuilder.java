package com.yuntu.basis_learn.design_parttern.builder;

public class NormalAirshipBuilder implements AirshipBuilder {
	@Override
	public Head buildHead() {
		return new Head("normal head");
	}

	@Override
	public Escape buildEscape() {
		return new Escape("normal escape");
	}

	@Override
	public Engine buildEngine() {
		return new Engine("normal engine");
	}


}
