package com.yuntu.basis_learn.hash_learning;

import java.util.Objects;

/**
 * @author wang_lei
 * @date 2019-04-16
 * 重写equals hashCode方法练习
 */
public class Person implements Comparable{
	private int id;
	private String name;
	private String sex;
	private Integer age;

	public Person(int id, String name, String sex, Integer age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Person() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
//	//重写equals方法
//	@Override
//	public boolean equals(Object o){
//		//首先判断是否为空
//		if(null==o){
//			return false;
//		}
//		//其次判断是否同一类型
//		if(!(o instanceof Person)){
//			return false;
//		}
//		//最后将需要对比的属性用&&连接进行equals判断
//		Person person = (Person)o;
//		return person.age.equals(this.age) && person.name.equals(this.name) && person.sex.equals(this.sex);
//	}
//
//	//重写hashCode方法
//	@Override
//	public int hashCode(){
//		//首先声明一个初始值 可以是>=0的任何数（最好不要大于9)
//		int result = 1;
//		// 以最容易被jvm优化的数31 作为乘数 乘以result后加上equals方法中出现属性的hashCode
//		result = 31 * result +(this.sex==null?0:this.sex.hashCode());
//		result = 31 * result +(this.name==null?0:this.name.hashCode());
//		result = 31 * result +(this.age==null?0:this.age.hashCode());
//		return result;
//	}

	// 一般ide有自动生成的方法可供使用
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return Objects.equals(getName(), person.getName()) &&
				Objects.equals(getSex(), person.getSex()) &&
				Objects.equals(getAge(), person.getAge());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getSex(), getAge());
	}

	// 对比方式： 如果本类的属性大于对比的对象中的属性返回整数  则是正序排序 否则倒序排序
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		if(this.age>p.age) {
			return 1;
		} else if(this.age<p.age){
			return -1;
		} else if(this.id>p.id){
			return 1;
		} else if(this.id<p.id){
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				'}';
	}
}
