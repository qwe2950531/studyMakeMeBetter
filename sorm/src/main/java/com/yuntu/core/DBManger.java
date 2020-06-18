package com.yuntu.core;

import com.yuntu.bean.Configuration;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 根据配置信息，维持连接对象的管理(增加连接池功能)
 * @author wang_lei
 * @date 2019-06-05
 */
public class DBManger {
	private static Configuration conf;
	static {

		Properties pros = new Properties();
		try {
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		conf = new Configuration();
		conf.setDriver(pros.getProperty("driver"));
		conf.setUsr(pros.getProperty("username"));
		conf.setPass(pros.getProperty("password"));
		conf.setUrl(pros.getProperty("url"));
		conf.setPoPackage(pros.getProperty("beanPackage"));
		conf.setSrcPath(pros.getProperty("srcPath"));
		conf.setUsingDB(pros.getProperty("usingDB"));
	}

	public static Connection getConn(){
		Connection connection = null;
		try {
			Class.forName(conf.getDriver());
			connection= DriverManager.getConnection(conf.getUrl(), conf.getUsr(), conf.getPass());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

	public static void closeConn(Connection connection, Statement statement, ResultSet resultSet){
		if(connection!=null){
			try {
				connection.close();
				if(statement!=null){
					statement.close();
				}
				if(resultSet!=null){
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static Configuration getConf(){
		return conf;
	}

}
