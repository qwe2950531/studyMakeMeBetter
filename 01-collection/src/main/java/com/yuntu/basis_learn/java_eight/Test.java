package com.yuntu.basis_learn.java_eight;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Test {

	@org.junit.Test
	public void sort(){
		List<Apple> apples = new ArrayList<Apple>();
		Apple appleOne = new Apple(15,"yellow");
		apples.add(appleOne);
		Apple appleTwo = new Apple(12,"green");
		apples.add(appleTwo);
		Apple appleThree = new Apple(13,"green");
		apples.add(appleThree);
		Apple appleFour = new Apple(11,"yellow");
		apples.add(appleFour);
		System.out.println(apples);
//		Collections.sort(apples, new Comparator<Apple>() {
//			@Override
//			public int compare(Apple o1, Apple o2) {
//				return o1.getWeight().compareTo(o2.getWeight());
//			}
//		});
		apples.sort(comparing(Apple::getWeight));
		System.out.println(apples);

	}
}
