package com.yuntu.bean;

import lombok.Data;

import java.util.Map;
/**
 * @author wang_lei
 * @date 2019-06-05
 * 表信息
 */
@Data
public class TableInfo {
	/**
	 * 表名
	 */
	private String name;
	/**
	 * 字段信息
	 */
	private Map<String,ColumnInfo> columns;
	/**
	 * 主键信息
	 */
	private ColumnInfo primaryKey;

	public TableInfo(String name, Map<String, ColumnInfo> columns, ColumnInfo primaryKey) {
		this.name = name;
		this.columns = columns;
		this.primaryKey = primaryKey;
	}

	public TableInfo() {
	}
}
