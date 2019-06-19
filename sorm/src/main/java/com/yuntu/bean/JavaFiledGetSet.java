package com.yuntu.bean;

import lombok.Data;

@Data
public class JavaFiledGetSet {
	/**
	 * 属性的源码信息，如:private int userId
	 */
	private String fieldInfo;
	/**
	 * 属性的set get方法信息
	 */
	private String getInfo;
	private String setInfo;

	public JavaFiledGetSet(String fieldInfo, String getInfo, String setInfo) {
		this.fieldInfo = fieldInfo;
		this.getInfo = getInfo;
		this.setInfo = setInfo;
	}

	public JavaFiledGetSet() {
	}

	@Override
	public String toString() {
		return fieldInfo + getInfo + setInfo;
	}
}
