package com.yuntu.basis_learn.design_parttern.builder;

/**
 * @author wang_lei
 * 飞船构建者
 */
public interface AirshipBuilder {
	Head buildHead();
	Escape buildEscape();
	Engine buildEngine();
}
