package com.yuntu.basis_learn.design_parttern.memento;

import lombok.Data;

/**
 * @author wang_lei
 * 备忘目标对象
 */
@Data
public class Emp {
	private String name;
	private int age;
	private double salary;

	public Emp(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public EmpMemento memento(){
		return new EmpMemento(this);
	}

	public void  recovery(EmpMemento mmt){
		this.name =mmt.getName();
		this.age =mmt.getAge();
		this.salary =mmt.getSalary();
	}

}
