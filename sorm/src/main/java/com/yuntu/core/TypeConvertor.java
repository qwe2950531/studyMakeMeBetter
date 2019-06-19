package com.yuntu.core;

/**
 * 负责java数据类型和数据库类型的互相转换
 * @author wang_lei
 * @date 2019-06-04
 */
public interface TypeConvertor {
	/**
	 * 将数据库类型转换为java数据类型
	 * @param columnType 数据库类型
	 * @return java数据类型
	 */
	public String databaseType2JavaType(String columnType);

	/**
	 * 将Java数据类型转换成数据库类型
	 * @param javaDataType java数据类型
	 * @return  数据库类型
	 */
	public String javaType2DatabaseType(String javaDataType);
}
