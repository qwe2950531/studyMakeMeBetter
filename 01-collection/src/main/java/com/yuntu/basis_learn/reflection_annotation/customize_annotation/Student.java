package com.yuntu.basis_learn.reflection_annotation.customize_annotation;

public class Student {
	@ORMAnnotation(columnName = "name",type = "VARCHAR",length = 255)
	private String name;
//	@ORMAnnotation(columnName = "age",type = "INT",length = 11)
	private int age;
	@ORMAnnotation(columnName = "score",type = "VARCHAR",length = 11)
	private int score;

	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
