package com.yuntu.basis_learn.data_structure.line_table.array_list;

import java.util.Arrays;

public class MyArrayList<T> implements List {
	int count;
	private Object[] objects;

	public MyArrayList(int capacity){
		objects = new Object[capacity];
	}
	public MyArrayList(){
		objects = new Object[16];
	}
	@Override
	public int size() {
		return count;
	}

	@Override
	public T get(int i) {
		if(i<0||i>=count){
			throw new IndexOutOfBoundsException("数组越界！");
		}
		return (T) objects[i];
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}

	@Override
	public boolean contains(Object e) {
		for(int i=0;i<count;i++){
			if(objects[i].equals(e)){
				return true;
			}
		}
		return false;
	}


	@Override
	public int indexOf(Object e) {
		for(int i=0;i<count;i++){
			if(objects[i].equals(e)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public void add(int i, Object e) {
		if(i<0||i>count){
			throw new IndexOutOfBoundsException("数组越界！");
		}
		addCapacity();
		System.arraycopy(objects,i,objects,i+1,count-i);
		objects[i]=e;
		count++;
	}

	@Override
	public void add(Object e) {
		addCapacity();
		objects[count]=e;
		count++;

	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		addCapacity();
		int i = indexOf(obj);
		if(i==-1){
			return false;
		} else {
			add(i,e);
			return true;
		}
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		addCapacity();
		int i = indexOf(obj);
		if(i==-1){
			return false;
		} else {
			add(i+1,e);
			return true;
		}
	}

	@Override
	public T remove(int i) {
		if(i<0||i>=count){
			throw new IndexOutOfBoundsException("数组越界！");
		}
		Object result = objects[i];
		System.arraycopy(objects,i+1,objects,i,count-i-1);
		count--;
		return (T) result;
	}

	@Override
	public boolean remove(Object e) {
		int i = indexOf(e);
		if(i==-1){
			return false;
		} else {
			remove(i);
		}
		return false;
	}

	@Override
	public T replace(int i, Object e) {
		if(i<0||i>=count){
			throw new IndexOutOfBoundsException("数组越界！");
		}
		objects[i]=e;
		return (T) e;
	}

	private void addCapacity(){
		if(count==objects.length){
			Object[] objects = Arrays.copyOf(this.objects, count * 2);
			this.objects=objects;
		}
	}

	public void display() {
		for(int i=0;i<count;i++){
			System.out.println(objects[i]);
		}
	}
}
