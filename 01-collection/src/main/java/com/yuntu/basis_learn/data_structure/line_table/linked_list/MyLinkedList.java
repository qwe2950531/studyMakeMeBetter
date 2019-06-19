package com.yuntu.basis_learn.data_structure.line_table.linked_list;

import com.yuntu.basis_learn.data_structure.line_table.array_list.List;

public class MyLinkedList implements List {
	private Node first;
	private int size;
	public MyLinkedList(){
		first =new Node();
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public Object get(int i) {
		while(i!=0){

			i--;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return getLast()==first;
	}

	@Override
	public boolean contains(Object e) {
		if(isEmpty()){
			return false;
		} else {
			Node node = first;
			int count = size;
			while (count!=0){
				node = node.next;
				if(node.data.equals(e)){
					return true;
				}
				count--;
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		if(isEmpty()){
			return -1;
		} else {
			Node node = first;
			int count = size;
			int index = -1;
			while (count!=0){
				index++;
				node = node.next;
				if(node.data.equals(e)){
					return index;
				}
				count--;
			}
		}
		return -1;
	}

	@Override
	public void add(int i, Object e) {
		if(i<0||i>size){
			throw new IndexOutOfBoundsException("数组越界"+i);
		}
		Node node = first;
		while(i!=0){
			node=node.next;
			i--;
		}
		Node newNode = new Node();
		newNode.data=e;
		newNode.next=node.next;
		node.next=newNode;
		size++;
	}

	@Override
	public void add(Object e) {
		Node<Object> objectNode = new Node<>();
		objectNode.data=e;
		Node node = new Node();
		node.data=e;
		getLast().next=node;
		size++;
	}

	@Override
	public boolean addBefore(Object obj, Object e) {
		size++;
		return false;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		size++;
		return false;
	}

	@Override
	public Object remove(int i) {
		size--;
		return null;
	}

	@Override
	public boolean remove(Object e) {
		size--;
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		return null;
	}

	private Node getFirst(){
		return first.next;
	}

	private Node getLast(){
		Node node = first;
		int count = size;
		while(count!=0){
			node = node.next;
			count--;
		}
		return node;
	}
}
