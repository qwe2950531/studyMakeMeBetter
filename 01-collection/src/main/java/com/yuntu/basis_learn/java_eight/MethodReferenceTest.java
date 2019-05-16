package com.yuntu.basis_learn.java_eight;


/**
 * @author wang_lei
 */
public class MethodReferenceTest {
	public static void main(String[] args) {
		// 静态方法引用
//		Apple apple = new Apple();
//		apple.setWeight(11);
//		apple.setColor("green");
//		Function<String,Integer> function = Integer::parseInt;
//		Integer apply = function.apply("11");
//		System.out.println(apply);

		// 对象方法引用
//		Function<Apple,String> appleStringFunction = Apple::getColor;
//		System.out.println(appleStringFunction.apply(apple));

		// 构造函数引用
//		Supplier<Apple> appleSupplier = Apple::new;
//		Apple apple1 = appleSupplier.get();
	}

}
