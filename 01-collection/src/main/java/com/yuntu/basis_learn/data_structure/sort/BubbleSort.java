package com.yuntu.basis_learn.data_structure.sort;

public class BubbleSort {
	private int [] arr;
	public BubbleSort(){

	}
	public BubbleSort(int []arr){
		this.arr = arr;
	}
	public void display(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public void bubbleSort(){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				int key = arr[j+1];
				if(key<arr[j]){
					arr[j+1]=arr[j];
					arr[j]=key;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[]arr = new int[]{2,8,5,3,7,1};
		BubbleSort bubbleSort = new BubbleSort(arr);
		bubbleSort.display();
		bubbleSort.bubbleSort();
		bubbleSort.display();
	}
}
