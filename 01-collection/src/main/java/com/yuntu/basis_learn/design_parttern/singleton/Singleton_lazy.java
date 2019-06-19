package com.yuntu.basis_learn.design_parttern.singleton;

/**
 * @author wang_lei
 * 单例懒汉式
 */
public class Singleton_lazy {
	/**
	 * 声明自身类型变量但是不初始化
	 */
	private static Singleton_lazy s = null;

	/**
	 * 私有化构造器
	 */
	private Singleton_lazy(){
		if(s!=null){
			throw new RuntimeException("防反射破解");
		}
	}

	/**
	 * 创建懒汉式获取实例方法
	 * @return
	 */
	public synchronized static Singleton_lazy getInstance(){
		if(s==null){
			s = new Singleton_lazy();
		}
		return s;
	}
}
