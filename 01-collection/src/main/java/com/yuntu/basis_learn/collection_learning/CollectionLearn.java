package com.yuntu.basis_learn.collection_learning;

import java.util.*;

/**
 * @author wang_lei
 * @date 2019-04-16
 * Collection接口学习
 * Collection接口本身没有实现 实现都是set或者list
 */
public class CollectionLearn {
	public static void main(String[] args) {
		/**
		 * 使用Collection时 数据的有序性和唯一性由具体实现决定  基础操作部分
		 */
		Collection<String> cl = new ArrayList<>();
		 // add方法
		cl.add("c1");
		List<String> list = new ArrayList<String>();
		list.add("l2");
		list.add("l3");
		list.add("l4");
		list.add("l5");
		//addAll方法可以使用Collection的实现类作为参数
		cl.addAll(list);
		//清空所有元素
//		cl.clear();

		//判断是否包含某元素
//		boolean isContain = cl.contains("l5");

		//判断是否包含Collection中的全部元素 （如有重复也算包含）
//		boolean isContainAll = cl.containsAll(Arrays.asList("l2", "l3","l3"));

		//判断是否相等（顺序因素也会包含在内）
//		boolean isEquals = cl.equals(Arrays.asList("c1","l2", "l3", "l4", "l5"));

		//获取hashCode
//		int hashCode = cl.hashCode();

		//判断Collection元素是否为空
//		boolean isEmpty = cl.isEmpty();

		//获取迭代器
//		Iterator<String> iterator = cl.iterator();

		//获取低迭代指针当前指向的元素  并将指针向后移动一位
//		iterator.next();

		//判断判断当前指针指向的位置后面是否还有元素
//		iterator.hasNext();

		//移除当前迭代器最后一次next返回的元素 在下一次next()调用之前最多调用一次 否则报非法异常
//		iterator.remove();

		//遍历当前指针后续的所有元素
//		iterator.forEachRemaining(System.out::println);

		//删除指定元素
//		cl.remove("c1");

		//删除指定集合的交集部分
//		cl.removeAll(Arrays.asList("c1","l2"));

		//获取与指定集合的交集部分(返回值为布尔型 指代是否成功）
//		boolean b = cl.retainAll(Arrays.asList("111"));



		// TODO: 2019/4/16 java8新特性学习后补全stram流操作集合内容
//		cl.stream();
//		Spliterator<String> spliterator = cl.spliterator();
//		cl.removeIf();
		//将当前集合元素转换为数组 (默认Object数组  可指定类型)
//		String[] strings = cl.toArray(new String[12222]);
//		cl.parallelStream();
		//返回当前集合大小
//		int size = cl.size();
	}

}
