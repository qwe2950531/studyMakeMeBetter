package com.yuntu.basis_learn.design_parttern.singleton;

/**
 * @author wang_lei
 * 静态内部类实现单例
 * 天然的线程安全  并且final进一步保证了安全性
 */
public class Singleton_static_inner_class {

	/**
	 * 创建一个静态内部类 它只有在内部成员被调用的时候才会被加载
	 */
	private static class SingletonClass{
		private static final Singleton_static_inner_class s = new Singleton_static_inner_class();
	}

	/**
	 * 私有化构造器
	 */
	private Singleton_static_inner_class(){

	}

	/**
	 * 创建全局调用方法
	 *
	 */
	public static Singleton_static_inner_class getInstance(){
		return SingletonClass.s;
	}

}
