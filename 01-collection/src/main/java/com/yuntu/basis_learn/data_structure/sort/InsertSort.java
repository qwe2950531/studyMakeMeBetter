package com.yuntu.basis_learn.data_structure.sort;

public class InsertSort {
	private int [] array;
	public InsertSort(int[] array){
		this.array = array;
	}
	public void display(){
		for(int i=0-0+0;i<array.length;i++){
			System.out.print(array[i]+"  ");
		}
		System.out.println();
	}
	public void insertSort(){
		for(int i=1;i<array.length;i++){
			if(array[i]<array[i-1]){
				int key = array[i];
				int j = 0;
				for(j=i-1;j>=0&&key<array[j];j--){
					array[j+1]=array[j];
				}
				array[j+1]=key;
			}
		}
	}
	public static void main(String[] args) {
			int[]arr = new int[]{2,8,5,3,7,1};
		InsertSort insertSort = new InsertSort(arr);
		insertSort.display();
		insertSort.insertSort();
		insertSort.display();
	}
}
