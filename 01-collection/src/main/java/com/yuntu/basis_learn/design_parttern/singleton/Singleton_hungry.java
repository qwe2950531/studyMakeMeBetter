package com.yuntu.basis_learn.design_parttern.singleton;

import java.io.Serializable;

/**
 * @author wang_lei
 * 饿汉式单例模式的实现
 */
public class Singleton_hungry implements Serializable {

	/**
	 * 	声明静态变量变量注入实例
 	 */
	private static final Singleton_hungry s = new Singleton_hungry();
	/**
	 * 	私有化构造函数
 	 */
	private Singleton_hungry(){

	}

	/**
	 * 创建公开静态方法返回创建好的实例
	 * @return 实例对象
	 */
	public static Singleton_hungry getInstance(){
		return s;
	}


	private Object readResolve(){
		return s;
	}
}
