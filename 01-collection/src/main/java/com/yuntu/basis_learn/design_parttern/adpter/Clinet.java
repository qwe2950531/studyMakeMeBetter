package com.yuntu.basis_learn.design_parttern.adpter;

/**
 * @author wang_lei
 * 适配器设计模式的演示
 * 当我们有一个新的类需要使用 需要避免改代码时使用
 */
public class Clinet {
	public static void main(String... args){
		// 用户原本只能使用刷子画画
	Printer brush =new Brush();
		print(brush);

		// 后来客户改需求了想用笔也能画画 这样直接创建显然是行不通的 去修改铅笔的代码显示不是一件优雅的事(况且原本的write代码也没必要实现两次)
//	Printer pencil = new Pencil();
//		print(Pencil);

		//  于是这里就需要用到我们的适配器设计模式了  把原本不优雅的事变得优雅！
		Printer pencil = new PrinterAdapter();
		print(pencil);
	}

	public static void print(Printer printer){
		printer.print();
	}
}
