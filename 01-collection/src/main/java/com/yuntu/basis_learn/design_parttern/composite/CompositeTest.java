package com.yuntu.basis_learn.design_parttern.composite;

import java.util.ArrayList;

public class CompositeTest {
	public static void main(String[] args) {
		AbstractFile fileOne = new ImageFile("我是图片！");
		AbstractFile fileTwo = new TextFile("我是文字!");
		Folder folder = new Folder(new ArrayList<AbstractFile>(),"我是文件夹！");
		folder.add(fileOne);
		folder.add(fileTwo);
		folder.killVirus();
	}
}
