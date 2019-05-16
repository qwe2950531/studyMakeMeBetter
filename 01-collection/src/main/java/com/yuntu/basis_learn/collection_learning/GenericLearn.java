package com.yuntu.basis_learn.collection_learning;

/**
 * @author wang_lei
 * @date 2019-04-16
 * 泛型
 */
public class GenericLearn {
	/**
	 * 	泛型可以是一个类有操作多种数据类型的可能 省去了很多不必要的麻烦（使用括号强转操作） 增强了代码的可读性简洁性
	 */
	public static void main(String ... args){
		MyCollection<String> myCollection = new MyCollection<String>();
		myCollection.setObject("www",2);
		System.out.println(myCollection.getObject(2));
	}


	static class MyCollection<E>{
		Object[] objects = new Object[5];

		public void setObject(E e ,int index){
			objects[index]=e;
		}

		public E getObject(int index){
			return (E)objects[index];
		}
	}
}
