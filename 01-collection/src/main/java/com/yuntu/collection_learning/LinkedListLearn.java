package com.yuntu.collection_learning;

import java.util.Arrays;
import java.util.Iterator;
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
//		linkedList.removeFirst();
//		linkedList.removeFirstOccurrence("l7");
//		linkedList.removeLast();
//		linkedList.removeLastOccurrence("l8");
//		linkedList.clear();
//		linkedList.clone();
//		linkedList.contains("l2");
//		linkedList.element();
//		linkedList.get(2);
//		linkedList.set(3,"l11");
//		linkedList.getLast();
//		linkedList.getFirst();
//		linkedList.indexOf("l3");
//		linkedList.lastIndexOf("l4");
//		linkedList.offer("l7");
//		linkedList.offerFirst("l8");
//		linkedList.offerLast("l9");
//		linkedList.peek();
//		linkedList.pop();
//		linkedList.peekFirst();
//		linkedList.peekLast();
//		linkedList.poll();
//		linkedList.pollFirst();
//		linkedList.pollLast();
//		linkedList.push("l10");








		linkedList.listIterator();
		Iterator<String> stringIterator = linkedList.descendingIterator();


	}
}
