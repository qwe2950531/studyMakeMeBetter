package com.yuntu.basis_learn.design_parttern.singleton;

/**
 * @author wang_lei
 * 双重锁检测单例
 */
public class Singleton_double_check {
	/**
	 *  声明变量不实例化
	 */
	private static Singleton_double_check s = null;

	/**
	 * 私有化构造器
	 */
	private Singleton_double_check(){

	}

	/**
	 * 创建全局访问方法 并使用双重检测提高并发效率
	 * @return
	 */
	public static Singleton_double_check getInstance(){
		if(s==null){
			synchronized (Singleton_double_check.class){
				Singleton_double_check s1 = s;
				if(s1 == null){
					synchronized (Singleton_double_check.class){
						s1 = new Singleton_double_check();
					}
					s = s1;
				}
			}
		}
		return s;
	}
}
