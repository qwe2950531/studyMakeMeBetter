package com.yuntu.basis_learn.java_eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author wang_lei
 */
public class AfterUsingLambda {
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
		AfterUsingLambda filter = new AfterUsingLambda();
		List<Apple> appleList = filter.filter(apples, Predicate.isEqual(appleThree).negate() );
//		appleList.stream().filter(Predicate.isEqual(appleFour).and(Predicate.isEqual(appleTwo)));
		System.out.println(appleList);
	}
	public <T> List<T> filter(List<T> list, Predicate predict){
		List<T> result = new ArrayList<T>();
		for(T t : list){
			if(predict.test(t)){
				result.add(t);
			}
		}
		return result;
	}
}
