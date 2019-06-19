package com.yuntu.core;

import com.project.bean.Feature;
import com.yuntu.bean.ColumnInfo;
import com.yuntu.bean.TableInfo;
import com.yuntu.utils.JDBCUtils;
import com.yuntu.utils.JavaFileUtils;
import com.yuntu.utils.ReflectUtils;
import com.yuntu.utils.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MySqlQuery implements Query {
	public static void main(String[] args) {
		JavaFileUtils.updateJavaPOFile();
		Feature feature = new Feature();
		feature.setId(1112);
		feature.setCase_action_name("s喝ssss了奥213123术大师");
		MySqlQuery mySqlQuery = new MySqlQuery();

		mySqlQuery.update(feature,new String[]{"id","case_action_name"});
//		Feature feature = new Feature();
//		feature.setId(111);
//		MySqlQuery mySqlQuery = new MySqlQuery();
//		mySqlQuery.delete(feature);
	}
	@Override
	public int excuteDML(String sql, Object[] params) {
		Connection conn = DBManger.getConn();
		int count = 0;
		PreparedStatement ps = null;
		try {
		   ps =	conn.prepareStatement(sql);
		  JDBCUtils.handleParams(ps,params);
		   count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManger.closeConn(conn,ps,null);
		}
		return count;
	}

	@Override
	public void insert(Object object) {
		Class<?> aClass = object.getClass();
		TableInfo tableInfo = TableContext.classMapTable.get(aClass);
		StringBuilder sb = new StringBuilder();
		sb.append("insert into "+tableInfo.getName());
		sb.append(" (");
		Iterator<ColumnInfo> iterator = tableInfo.getColumns().values().iterator();
		List objects = new ArrayList();
		while(iterator.hasNext()){
			ColumnInfo next = iterator.next();
				sb.append(next.getName()+",");
			try {
				Field declaredField = aClass.getDeclaredField(next.getName());
				declaredField.setAccessible(true);
				Object o = declaredField.get(object);
				objects.add(o);
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		sb.setCharAt(sb.length()-1,')');
		sb.append(" VALUES (");
		for(int i=0;i<aClass.getDeclaredFields().length;i++){
				sb.append("?,");
		}
		sb.setCharAt(sb.length()-1,')');

		excuteDML(sb.toString(),objects.toArray());
	}

	@Override
	public int delete(Class clazz, Object id) {
		TableInfo tableInfo = TableContext.classMapTable.get(clazz);
		String sql = "delete from "+tableInfo.getName()+" where "+tableInfo.getPrimaryKey().getName()+" = ?";
		excuteDML(sql,new Object[]{id});
		return 0;
	}

	@Override
	public void delete(Object o) {
		Class c = o.getClass();
		TableInfo tableInfo;
		tableInfo = TableContext.classMapTable.get(o.getClass());
		System.out.println(tableInfo);
		ColumnInfo primaryKey = tableInfo.getPrimaryKey();
			Object primaryKeyValue = ReflectUtils.invokeGet( primaryKey.getName(), o);
			delete(c,primaryKeyValue);
	}

	@Override
	public int update(Object obj, String[] fieldNames) {
		// update xxx set x=?,x=? where id = ?;
		StringBuilder sb = new StringBuilder();
		Class<?> aClass = obj.getClass();
		TableInfo tableInfo = TableContext.classMapTable.get(aClass);
		sb.append("update "+tableInfo.getName()+" set");
		List<Object> params = new ArrayList<Object>();
		for(String fieldName : fieldNames){
			Object o = ReflectUtils.invokeGet(fieldName, obj);
			params.add(o);
			sb.append(" "+fieldName+"=?,");
		}
		sb.setCharAt(sb.length()-1,' ');
		sb.append("where "+tableInfo.getPrimaryKey().getName()+"=?;");
		params.add(ReflectUtils.invokeGet(tableInfo.getPrimaryKey().getName(),obj));
		return excuteDML(sb.toString(),params.toArray());
	}

	@Override
	public List queryRows(String sql, Class clazz, Object[] params) {
		return null;
	}

	@Override
	public Object queryUniqueRow(String sql, Class clazz, Object[] params) {
		return null;
	}

	@Override
	public Object queryValue(String sql, Object[] params) {
		return null;
	}

	@Override
	public Number queryNumber(String sql, Object[] params) {
		return null;
	}
}
