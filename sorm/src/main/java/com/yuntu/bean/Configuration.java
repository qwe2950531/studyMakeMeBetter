package com.yuntu.bean;

import lombok.Data;

/**
 * @author wang_lei
 * @date 2019-06-05
 * 配置类
 */
@Data
public class Configuration {
	/**
	 * jdbc url
	 */
	private String url;
	/**
	 * 数据库用户名
	 */
	private String usr;
	/**
	 * 数据库密码
	 */
	private String pass;
	/**
	 * 数据库驱动类
	 */
	private String driver;
	/**
	 * 使用的数据库名
	 */
	private String usingDB;
	/**
	 * 项目源文件目录
	 */
	private String srcPath;
	/**
	 * 存放bean的位置
	 */
	private String poPackage;

}
