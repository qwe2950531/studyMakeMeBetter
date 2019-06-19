package com.yuntu.bean;

import lombok.Data;

/**
 * 封装一个字段的信息
 * @author wang_lei
 */
@Data
public class ColumnInfo {
	/**
	 * 字段名称
	 */
	private String name;
	/**
	 * 字段类型
	 */
	private String dateType;
	/**
	 * 字段的键类型(0普通键,1:主键,2:外键)
	 */
	private int keyType;

	public ColumnInfo(String name, String dateType, int keyType) {
		this.name = name;
		this.dateType = dateType;
		this.keyType = keyType;
	}

	public ColumnInfo() {
	}
}
