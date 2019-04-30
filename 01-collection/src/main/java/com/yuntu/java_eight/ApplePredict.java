package com.yuntu.java_eight;

/**
 * @author wang_lei
 */
//@FunctionalInterface
public interface ApplePredict<T> {
	/**
	 * @param t 体类
	 * @return 根据筛选条件给出boolean值
	 */
	public  boolean test(T t);
}
