package com.yuntu.core;

import java.util.List;

/**
 * @author wang_lei
 * @date 2019-06-04
 */
public interface Query {
	/**
	 * 直接执行一个DML语句
	 * @param sql sql语句
	 * @param params  参数
	 * @return  影响的行数
	 */
	public int excuteDML(String sql,Object[] params);

	/**
	 * 将一个对象存入数据库中
	 * @param object  要存储的对象
	 */
	public void insert(Object object);

	/**
	 * 删除clazz表示类对应的表中的记录(指定id)
	 * @param clazz 跟表对应的类的class对象
	 * @param id  主键的值
	 * @return id 主键的值
	 */
	public int delete(Class clazz,Object id);

	/**
	 * 删除对象在数据库中对应的记录(对象所在的类对应表,对象的主键对应到记录)
	 * @param o 删除的对象
	 */
	public void delete(Object o);

	/**
	 * 更新对象对应的记录，并且只更新指定的字段的值
	 * @param obj  要更新的对象
	 * @param fieldNames  更新的字段
	 * @return  影响的行数
	 */
	public int update(Object obj,String []fieldNames);

	/**
	 * 查询返回多行记录,并将每行记录封装到Clazz指定的类的对象中
	 * @param sql sql语句
	 * @param clazz clazz封装数据的javabean类的class对象
	 * @param params  sql的参数
	 * @return 查询的结果
	 */
	public List queryRows(String sql,Class clazz,Object[] params);

	/**
	 * 查询并返回一条记录,并将每行记录封装到Clazz指定的类的对象中
	 * @param sql sql语句
	 * @param clazz clazz封装数据的javabean类的class对象
	 * @param params  sql的参数
	 * @return 查询的结果
	 */
	public Object queryUniqueRow(String sql,Class clazz,Object[] params);

	/**
	 * 查询一行一列,并将值封装到对象中
	 * @param sql sql语句
	 * @param params  sql的参数
	 * @return 查询的结果
	 */
	public Object queryValue(String sql,Object[] params);

	/**
	 * 查询数字封装Number对象中
	 * @param sql sql语句
	 * @param params  语句中的参数
	 * @return  返回的值(Number型)
	 */
	public Number queryNumber(String sql,Object[] params);
}
