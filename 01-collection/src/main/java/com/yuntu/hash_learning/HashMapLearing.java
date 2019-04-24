package com.yuntu.hash_learning;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearing {
	public static void main(String[] args) {

		/**
		 * 基础操作部分
		 */
		Map<String,String> hashMap = new HashMap<String,String>();
		// 插入新的kv对
		hashMap.put("k1","v1");
		hashMap.put("k2","v2");
		hashMap.put("k3","v3");

		// 获取k为k1的v
//		hashMap.get("k1");

		// 判断map中是否包含键为k1的对
//		hashMap.containsKey("k1");

		// 清空map
//		hashMap.clear();

		// 获取entry Set
//		Set<Map.Entry<String, String>> entries = hashMap.entrySet();

		// 判断map中是否包含值为v1的entry
//		boolean v1 = hashMap.containsValue("v1");

		// 判断map是否为空
//		hashMap.isEmpty();

		// 获取k Set
//		Set<String> strings = hashMap.keySet();

		// 删除键为 k1的entry
//		hashMap.remove("k1");

		// 当键为k1且值为v2时才删除该entry
//		hashMap.remove("k1","v2");

		// 反正map中的entry数
//		hashMap.size();

		// 将所有的值作为Collection返回
//		Collection<String> values = hashMap.values();

		// 获取键为k3的值 如不存在则给予默认值"hello world"
//		String orDefault = hashMap.getOrDefault("k3", "hello world");


		// 将另一map中的所有entry与自己的entrySet合并
//		hashMap.putAll(newHash);

		// 仅当键为k3的entry不存在时才执行put操作
// 		hashMap.putIfAbsent("k3","v4");

		// 将键k2的值换成v111
//		hashMap.replace("k2","v111");

		// 替换键为k3的值 当且仅仅当值为v3时才执行替换
//		hashMap.replace("k3","v3","v333");


		//todo://待学完java8回顾
//		hashMap.compute()
//		hashMap.computeIfPresent()
// 		hashMap.computeIfAbsent()
//		hashMap.forEach();
//		hashMap.merge()
	}
}
