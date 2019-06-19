package com.yuntu.utils;

/**
 * 封装了常用的一些字符串操作
 * @author wang_lei
 */
public class StringUtils {
	public static String getFirstUpCaseString(String string){
		return string.toUpperCase().substring(0,1)+string.substring(1);
	}
}
