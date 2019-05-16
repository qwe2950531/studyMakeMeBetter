package com.yuntu.basis_learn.java_eight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang_lei
 */
public class BeforeUsingLambda {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		Apple appleOne = new Apple(15,"yellow");
		apples.add(appleOne);
		Apple appleTwo = new Apple(2,"green");
		apples.add(appleTwo);
		Apple appleThree = new Apple(13,"green");
		apples.add(appleThree);
		Apple appleFour = new Apple(11,"yellow");
		apples.add(appleFour);
		System.out.println(apples);
		BeforeUsingLambda filter = new BeforeUsingLambda();
//		List<Apple> greenApples = filter.filterApples(apples, new AppleFilterGreenPredict());
//		System.out.println(greenApples);
//		List<Apple> greaterApples = filter.filterApples(apples, new AppleFilterWeightGreaterTenPredict());
//		System.out.println(greaterApples);
//		List<Apple> filteredApples = filter.filterApples(apples, new ApplePredict() {
//			@Override
//			public boolean test(Apple apple) {
//				return apple.getWeight() > 10;
//			}
//		});
//		System.out.println(filteredApples);
	}
	public List<Apple> filterApples(List<Apple> apples,ApplePredict predict){
		List result = new ArrayList<Apple>();
		for(Apple apple : apples){
			if(predict.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}
}
