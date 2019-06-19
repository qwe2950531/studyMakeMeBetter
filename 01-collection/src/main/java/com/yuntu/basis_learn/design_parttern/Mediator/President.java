package com.yuntu.basis_learn.design_parttern.Mediator;

import java.util.HashMap;
import java.util.Map;

public class President {
	private Map<String,Department> map;
	public President(){
		map = new HashMap<>();
	}

	public void register(String name,Department department){
		map.put(name,department);
	}

	public void  commond(String name){
		Department department = map.get(name);
		if(department instanceof Finalcial){
			Finalcial finalcial =(Finalcial)department;
			if(finalcial.isHaveTime()){
				finalcial.selfAction();
			}
		} else if(department instanceof Development){
			Development development = (Development)department;
			if(development.isHaveTime()){
				department.selfAction();
			}
		}
	}
}
