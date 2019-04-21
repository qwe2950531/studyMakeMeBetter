package com.yuntu.collection_learning;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * @author wang_lei
 * @date 2019-04-19
 * 一直听说ArrayList比LinkedList遍历和随机访问效率高  LinkedList插入和删除效率比ArrayList效率高 那么来做个实验
 *
 */
public class ListTest {
	/**
	 *  测试项目： 顺序遍历  随机访问  随机插入 固定位置插入
	 *    前三项均为ArrayList获胜  最后一项规定位置插入删除 ArrayList小劣
	 * @param args
	 */
	public static void main(String ... args){
		int size =50000;
		Random random = new Random();
		double sumOne = 0;
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for(int i=0;i<size;i++){
			arrayList.add(Math.random());
		}

		LinkedList<Double> linkedList = new LinkedList<Double>();
		for(int i=0;i<size;i++){
			linkedList.add(Math.random());
		}

		long timeOne = System.currentTimeMillis();
		for(int i=0;i<size;i++){
			 arrayList.remove(0);
		}
		long timeTwo = System.currentTimeMillis();

		double timeFirst = timeTwo-timeOne;
		System.out.println(timeTwo-timeOne+"--ArrayList end!sum:"+sumOne);
		sumOne=0;

		 timeOne = System.currentTimeMillis();
		for(int i=0;i<size;i++){
			linkedList.remove(0);
		}
		timeTwo = System.currentTimeMillis();

		System.out.println(timeTwo-timeOne+"--LinkedList end!sum:"+sumOne);
		double timeSecond = timeTwo-timeOne;
//		System.out.println(timeSecond/timeFirst);
	}
	@Test
	public void testList(){
		MyLinkedList<String> stringMyLinkedList = new MyLinkedList<>();
		stringMyLinkedList.add(0,"l1");
		stringMyLinkedList.add(1,"l2");
		System.out.println(stringMyLinkedList.get(0));
		System.out.println(stringMyLinkedList.get(1));
	}

}
