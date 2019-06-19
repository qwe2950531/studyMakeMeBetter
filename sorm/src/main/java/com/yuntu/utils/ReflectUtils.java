package com.yuntu.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 封装了反射常用操作
 * @author wang_lei
 */
public class ReflectUtils {
	public static Object invokeGet(String fieldName,Object obj){
		try {
			Class<?> c = obj.getClass();
			Method method = c.getMethod("get" + StringUtils.getFirstUpCaseString(fieldName), null);

			return method.invoke(obj,null);

		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}
}
