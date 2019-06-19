package com.yuntu.basis_learn.design_parttern.prototype;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wang_lei
 * 克隆羊
 */
@Data
public class Ship implements Cloneable, Serializable {
	private String name;
	private Integer age;
	private Date bir;

	/**
	 * 浅克隆
	 * @return
	 * @throws CloneNotSupportedException
	 */
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	/**
	 * 将属性中的引用类型对象也克隆一遍称为深克隆
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Ship ship = (Ship)super.clone();
		ship.setBir((Date) this.bir.clone());
		return ship;
	}
}
