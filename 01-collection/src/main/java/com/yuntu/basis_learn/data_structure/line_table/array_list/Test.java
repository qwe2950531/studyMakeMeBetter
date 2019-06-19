package com.yuntu.basis_learn.data_structure.line_table.array_list;

public class Test {
	public static void main(String[] args) {
		MyArrayList<Object> objectMyArrayList = new MyArrayList<>();
		objectMyArrayList.add("sadasd1");
		objectMyArrayList.add("sadasd2");
		objectMyArrayList.add("sadasd3");
		objectMyArrayList.add("sadasd4");
		objectMyArrayList.add("sadasd5");
		objectMyArrayList.add("sadasd6");
		objectMyArrayList.add("sadasd7");
		System.out.println(objectMyArrayList.size());
		objectMyArrayList.remove(2);
		System.out.println(objectMyArrayList.size());

		objectMyArrayList.display();


	}
}
