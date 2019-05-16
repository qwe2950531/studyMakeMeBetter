package com.yuntu.basis_learn.collection_learning;

import java.util.*;

/**
 * @author wang_lei
 * @date 2019-04-17
 * 顺序存储结构的线性表使用
 */
public class ArrayListLearn {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		/**
		 * 		ArrayList基础操作
		 *
		 *
		 * 	 ArrayList 底层由数组实现所以在操作索引时同样受到数组越界限制  索引值范围  list.size()>=index>0
		 * 	 ArrayList可以存储null
		 */

		// 向list尾部添加元素
		list.add("l1");
		list.add("l2");
		list.add("l3");
		list.add("l4");

		// 向list指定位置插入元素 第一步 index~list.size()全部右移一位  第二步向索引位置添加指定元素
//		list.add(1,"l2");

		// 向list尾部添加指定collection中的所有元素 索引位置为size
//		list.addAll(Arrays.asList("l3","l4"));

		// 向list指定索引位置插入指定collection中的所有元素
//		list.addAll(2,Arrays.asList("l5","l6"));

		// 获取指定索引位置元素 越界报错
//		list.get(3);

		// 更新索引位置的元素 越界报错 范围(list.size()>index>0)
//		list.set(3,"l10");

		// 从list移除指定元素(返回是否移除成功)
//		boolean l2 = list.remove("l2");

		// 移除指定索引位置元素  返回移除元素
//		Object remove = list.remove(1);

		// 判断是否包含指定元素
//		boolean l1 = list.contains("l1");

		// 查询list包含元素数量
//		list.size();

		// 正序查找元素索引位置 没找到返回-1
//		int l2 = list.indexOf("l2");

		// 判断list是否为空
//		boolean isEmpty = list.isEmpty();

		// 调用元素自身的toString方法进行字符串拼接
//		String s = list.toString();

		// 反序查找元素下标  无果返回-1
//		list.lastIndexOf("l5");


		/**
		 * 	ArrayList集合复杂操作
		 */


		// 去除list中多余空位
//		list.trimToSize();

		// 清空list中的所有元素
//		list.clear();

		// 浅复制
//		List newList = (List)list.clone();

		//提升ArrayList容量为最少指定数
//		list.ensureCapacity(22);
		// todo: 了解过排序算法后回顾
//		list.sort(Comparator.comparing( (String s) -> s).reversed());


		// todo; 了解游标后更新 iterator理解
		// 获取迭代器
//		Iterator iterator = list.iterator();

		// 获取list的迭代器  可以指定索引位置作为起点
//		ListIterator listIterator = list.listIterator(2);
		// 判断当前迭代器指针是否有下一个元素
//		listIterator.hasNext();

		// 判断当前迭代器指针是否有前一个元素
//		boolean hasPrevious = listIterator.hasPrevious();

		// 获取当前迭代器指针索引
//		int nextIndex = listIterator.nextIndex();

		// 获取当前指针指向元素 并将指针后移
//		listIterator.next();

		// 返回当前指针前一个元素 并将指针前移一位
//		listIterator.previous();

		// 更新上一个next()或者previous()返回的值
//		listIterator.set("l10");

		// 删除上一个next()或者previous()返回的值
//		listIterator.remove();

		// 返回当前指针前一个指针的元素索引位置
//		listIterator.previousIndex();

		// 在当前迭代器指针的索引位置插入元素
//		listIterator.add("l0");

		// 删除指定集合与本身集合的所有交集元素
//		list.removeAll(Arrays.asList("l3","l4"));

		// 将当前集合中的所有元素设置为与指定集合的交集
//		list.retainAll(Arrays.asList("l9"));

		// 判断本身集合是否包含指定集合的所有元素
//		list.containsAll(Arrays.asList("l2","l3"));

		// 取出指定索引区间的所有元素作为子集返回(不包含第二个索引位置的元素)
//		List<String> strings = list.subList(1,list.size());

		// 将ArrayList转换为数组
//		list.toArray();

		// 将ArrayList转换为指定类型数组
//		list.toArray(new String[list.size()]);


		//TODO: java8新特性 lambda表达式  stream流学习后回顾
//		list.forEach();
//		list.stream();
//		list.parallelStream();
//		Spliterator spliterator = list.spliterator();
//		list.removeIf();
//		list.replaceAll();

	}
}
