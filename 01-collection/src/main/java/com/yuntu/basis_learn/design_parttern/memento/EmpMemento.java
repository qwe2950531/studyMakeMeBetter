package com.yuntu.basis_learn.design_parttern.memento;

import lombok.Data;

/**
 * @author wang_lei
 * 备忘录对象
 */
@Data
public class EmpMemento {
	private String name;
	private int age;
	private double salary;
	public EmpMemento(Emp e){
		this.name = e.getName();
		this.age = e.getAge();
		this.salary = e.getSalary();
	}
}
