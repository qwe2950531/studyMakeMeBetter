package com.yuntu.core;

import com.yuntu.bean.ColumnInfo;
import com.yuntu.bean.TableInfo;
import com.yuntu.utils.JavaFileUtils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wang_lei
 * @date 2019-06-04
 * 负责获取管理数据库所有表结构和类结构的关系，并可以根据表结构生成类结构。
 */
public class TableContext {
	/**
	 * 表名映射表信息
	 */
	public static Map<String, TableInfo> nameMapTable = new HashMap<>();
	/**
	 * 类对象映射表信息
	 */
	public static Map<Class,TableInfo> classMapTable = new HashMap<>();

	//获取数据库元数据
	static {
		Connection con = DBManger.getConn();
		try {
			DatabaseMetaData databaseMetaData = con.getMetaData();
			ResultSet tableRet = databaseMetaData.getTables(null,"%","%",new String[]{"TABLE"});
			while(tableRet.next()){
				String tableName = (String)tableRet.getObject("TABLE_NAME");
				TableInfo ti = new TableInfo(tableName,new HashMap<>(),new ColumnInfo());
				nameMapTable.put(tableName,ti);
				ResultSet ornSet = databaseMetaData.getColumns(null,"%",tableName,"%");
				while(ornSet.next()){
					String columnName = ornSet.getString("COLUMN_NAME");
					ColumnInfo ci = new ColumnInfo(columnName,ornSet.getString("TYPE_NAME"),0);
					ti.getColumns().put(columnName,ci);
				}
				ResultSet priSet = databaseMetaData.getPrimaryKeys(null,"%",tableName);
				while(priSet.next()){
					ColumnInfo priCi = (ColumnInfo)ti.getColumns().get(priSet.getObject("COLUMN_NAME"));
					priCi.setKeyType(1);
					ti.setPrimaryKey(priCi);
				}


			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JavaFileUtils.loadPOTables();
	}

	public static void main(String[] args) {
	}
}
