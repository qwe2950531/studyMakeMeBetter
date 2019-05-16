package com.yuntu.basis_learn.collection_learning;

import java.util.Arrays;

public class MyArrayList<E> {
	public static final int DEFAULTCAPACITY = 16;

	private E[] elementDatas;

	private int size;
	public MyArrayList(){
		Object[] objects = new Object[DEFAULTCAPACITY];
		this.elementDatas = (E[])objects;
	}

	public MyArrayList(int capacity){
		if(capacity<0){
			throw new RuntimeException("容器初始值不可以为负数"+capacity);
		}
		if(capacity==0){
			capacity=DEFAULTCAPACITY;
		}
		Object[] objects = new Object[capacity];
		this.elementDatas = (E[])objects;
	}

	public void grow(int index){
		if(index==elementDatas.length){
			Object[] newArray = new Object[elementDatas.length<<1];
			System.arraycopy(this.elementDatas,0,newArray,0,this.elementDatas.length);
			this.elementDatas=(E[])newArray;
		}
	}
	public void ensureRange(int index){
		if(index<0||index>size){
			throw new RuntimeException("数组越界"+index);
		}
	}
	public void add(int index,E element){
		ensureRange(index);
		grow(index);
		if(index<size){
			System.arraycopy(this.elementDatas,index,this.elementDatas,index+1,size-index);
		}
		this.elementDatas[index]=element;
		size++;

	}
	public boolean add(E element){
		grow(size);
		this.elementDatas[size++]=element;
		return true;

	}
	public boolean remove(E element){
		boolean flag = false;
		Integer index = null;
		for(int i=0;i<size;i++){
			if(element.equals(this.elementDatas[i])){
				index = i;
				this.elementDatas[i]=null;
				break;
			}
		}
		if(index!=null){
			System.arraycopy(this.elementDatas,index+1,this.elementDatas,index,this.size-index-1);
			System.out.println(Arrays.toString(this.elementDatas));
			flag = true;
		}
		elementDatas[--size]=null;
		return flag;
	}
	public void remove(Integer index,E element){

		ensureRange(index==size?index+1:index);

		for(int i=0;i<this.elementDatas.length;i++){
			if(element.equals(this.elementDatas[i])){
				index = i;
				this.elementDatas[i]=null;
				break;
			}
		}
			System.arraycopy(this.elementDatas,index+1,this.elementDatas,index,this.size-1-index);
		elementDatas[--size]=null;

	}
	public void set(int index,E element){
			ensureRange(index);
			this.elementDatas[index] = element;
	}
	public E get(int index){
		ensureRange(index==size?index+1:index);
		return this.elementDatas[index];
	}

	public int getSize(){
		return size;
	}

	@Override
	public String toString() {
		return "MyArrayList{" +
				"elementDatas=" + Arrays.toString(elementDatas) +
				'}';
	}

	public static void main(String...args){
		MyArrayList list = new MyArrayList<String>();
		list.add("1");
		list.add("12");
		list.add("123");
		System.out.println(list.get(2));
		list.set(1,"222");
		System.out.println(list);
	}

}
