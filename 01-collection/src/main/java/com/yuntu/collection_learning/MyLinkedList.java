package com.yuntu.collection_learning;

public class MyLinkedList<E> {

	class Node <E>{
		Node next=null;
		Node prev=null;
		E data;
	}
	private Node first;
	private int size;
	public MyLinkedList(){
		Node node = new Node();
		this.first=node;
	}

	private boolean ensureRangeForAdd(int index){
		if(index<0||index>size){
			throw new RuntimeException("索引越界！"+index);
		}
		return true;
	}
	private boolean ensureRange(int index){
		if(index<0||index>=size){
			throw new RuntimeException("索引越界！"+index);
		}
		return true;
	}
	public void add(int index,E e){
		if(!ensureRangeForAdd(index)){
			return;
		}
		if(size==0){
			Node<E> eNode = new Node<>();
			eNode.data=e;
			this.first.next=eNode;
			size++;
			return;
		}
		Node node = this.first;
		for(int i=0;i<index;i++){
			node = node.next;
		}
		Node<E> eNode = new Node<>();
		eNode.data=e;
		eNode.next=node.next;
		node.next=eNode;
		size++;
	}

	public void add(E e){
		int index = size;
		Node node = this.first.next;;
		for(int i=0;i<index+1;i++){
			node = node.next;
		}
		node.data=e;
		size++;
	}

	public void remove(E e){

		size--;
	}
	public void remove(int index){
		if(!ensureRange(index)){
			return;
		}
		size--;
	}

	public E get(int index){
		if(!ensureRange(index)){
		}
		Node<E> node = first;
		for(int i=0;i<index+1;i++){
			node=node.next;
		}
		return node.data;
	}
	public void set(int index,E e){

	}
	public int size(){
		return this.size;
	}

}
