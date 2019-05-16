package com.yuntu.basis_learn.collection_learning;

import java.util.LinkedList;

public class LinkedListLearn {
	public static void main(String ... args){
		LinkedList<String> linkedList = new LinkedList<String>();

		/**
		 *  基础操作
		 */
		linkedList.add("l1");
		linkedList.add("l2");
		linkedList.add("l3");
		linkedList.add("l4");
		linkedList.add("l5");
		linkedList.add("l5");
		linkedList.add("l6");
		// 向尾部添加元素
//		linkedList.add("l1");

		// 向指定索引位置插入元素
//		linkedList.add(1,"l2");

		// 向尾部添加集合中的所有元素
//		linkedList.addAll(Arrays.asList("l3","l4"));

		// 向指定位置添加集合中的所有元素
//		linkedList.addAll(2,Arrays.asList("l5","l6"));

		// 向头部添加元素
//		linkedList.addFirst("l0");

		// 向尾部添加元素
//		linkedList.addLast("l100");

		// 删除指定索引位置元素并返回删除的元素
//		linkedList.remove(0);

		// 删除头部元素并返回删除的元素
//		linkedList.remove();

		// 查找指定元素位置并删除元素
//		linkedList.remove("l1");

		// 删除头部元素
//		linkedList.removeFirst();

		// 从头往前找删除找到的第一个元素 返回是否删除
//		linkedList.removeFirstOccurrence("l5");

		// 删除尾部元素 并返回该元素
//		linkedList.removeLast();

		// 从尾部往后找删除找到的第一个元素 反会是否成功
		linkedList.removeLastOccurrence("l5");

		// 清空list
//		linkedList.clear();

		// 浅复制list
//		linkedList.clone();

		// 判断list是否包含指定元素
//		linkedList.contains("l2");

		// 获取list中头部元素
//		linkedList.element();

		// 获取list中指定索引的元素
//		linkedList.get(2);

		// 将list中指定索引位置的元素修改为传入元素 并返回被修改的元素
//		linkedList.set(3, "l11");

		// 获取list中尾部元素
//		linkedList.getLast();

		// 获取list中头部元素
//		linkedList.getFirst();

		// 按正序查找指定元素索引位置
//		linkedList.indexOf("l3");

		// 按倒序查找指定元素索引位置
//		linkedList.lastIndexOf("l4");

		// 在尾部插入指定元素并且返回是否成功
//		linkedList.offer("l7");

		// 在头部插入指定元素并且返回是否成功
//		linkedList.offerFirst("l8");

		// 在尾部添加元素并且返回是否成功
//		linkedList.offerLast("l9");

		// 获取头部元素 peek 窥视之意
//		linkedList.peek();

		// 获取头部元素并将其在list中移除 pop 弹出之意
//		linkedList.pop();

		// 获取头部元素
//		linkedList.peekFirst();

		// 获取尾部元素
//		linkedList.peekLast();

		// 获取头部元素并且从list中删除该元素
//		linkedList.poll();

		// 同poll作用相同
//		linkedList.pollFirst();

		// 获取list尾部元素并且删除
//		linkedList.pollLast();

		// 从list头部插入元素
//		linkedList.push("l10");

		// 都是些迭代器  与ArrayList的没有什么不同
//		linkedList.listIterator();
//		Iterator<String> stringIterator = linkedList.descendingIterator();


	}
}
