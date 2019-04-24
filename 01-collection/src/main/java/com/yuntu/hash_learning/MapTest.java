package com.yuntu.hash_learning;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		MyHashMap<String,String> hashMap = new MyHashMap<String,String>();
		hashMap.put("k1","v1");
		hashMap.put("k2","v2");
		hashMap.put("k3","v3");
		hashMap.put("k3","v4");
		hashMap.put("k3","v5");
		System.out.println(hashMap.get("k2"));
		System.out.println(hashMap);
	}

	@Test
	public void testTreeMap(){
		Person person1 = new Person();
		person1.setName("wang_lei");
		person1.setAge(18);
		person1.setId(1);
		person1.setSex("男");
		Person person2 = new Person();
		person2.setName("shi_zhenzhen");
		person2.setAge(17);
		person2.setId(2);
		person2.setSex("女");
		Person person3 = new Person();
		person3.setName("xiao_mengni");
		person3.setAge(19);
		person3.setId(3);
		person3.setSex("女");
		Map treeMap = new TreeMap();
		treeMap.put(person1,"wang_lei");
		treeMap.put(person2,"shi_zhenzhen");
		treeMap.put(person3,"xiao_mengni");

	}
}
