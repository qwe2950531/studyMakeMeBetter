package com.yuntu.basis_learn.data_structure.sort;

public class ShellSort {
	private int [] arr;
	public ShellSort(int [] arr){
		this.arr = arr;
	}
	public ShellSort(){

	}
	public void display(){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public  void shellSort() {

		//增量每次都/2
		for (int step = arr.length / 2; step > 0; step /= 2) {
			//从增量那组开始进行插入排序，直至完毕
			for (int i = step; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				// j - step 就是代表与它同组隔壁的元素
				while (j - step >= 0 && arr[j - step] > temp) {
					arr[j] = arr[j - step];
					j = j - step;
				}
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[]arr = new int[]{2,8,5,3,7,1,2,6};
		ShellSort shellSort = new ShellSort(arr);
		shellSort.display();
		shellSort.shellSort();
		shellSort.display();
	}

}
