package com.yuntu.basis_learn.hash_learning;

public class MyHashMap<K,V> {
	class Node<K,V>{
		Node next;
		K key;
		V value;
		int hash;
	}
	Node [] table;
	int size;
	public MyHashMap(){
		table = new Node[16];
	}

	public void put(K key,V value){
		Node newNode = new Node();
		newNode.hash=hash(key.hashCode(), table.length);
		newNode.key=key;
		newNode.value=value;
		newNode.next=null;
		Node node = this.table[newNode.hash];
		Node lastNode = null;
		boolean repeat = true;
		if(node==null){
			this.table[newNode.hash]=newNode;
		} else {
			while(node!=null){
				if(node.key.equals(key)){
					node.value=newNode.value;
					repeat = false;
					break;
				} else {
					lastNode = node;
					node=node.next;
				}
			}
			if(repeat){
				lastNode.next=newNode;
			}
		}
	}
	public V get(K key){
		int hash = hash(key.hashCode(), this.table.length);
		Node node = this.table[hash];
		while(node!=null){
			if(node.key.equals(key)){
				return (V) node.value;
			}
			node=node.next;
		}
		return null;
	}
	@Override
	public String toString(){
		StringBuffer bs = new StringBuffer();
		bs.append("[");
		for (Node node : table){
			if(node!=null){
				bs.append("  "+node.key+"=");
				bs.append(node.value);
			}
		}
		bs.append("  ]");
		return bs.toString();
	}
	public int hash(int v,int length){
		int i = v & (length - 1);
		return i;
	}
}
