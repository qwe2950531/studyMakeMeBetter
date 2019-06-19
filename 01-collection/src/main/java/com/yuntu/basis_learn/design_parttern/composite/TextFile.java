package com.yuntu.basis_learn.design_parttern.composite;

import lombok.Data;

/**
 * @author wang_leo
 * 文本文件
 */
@Data
public class TextFile implements AbstractFile{
	private String fileName;
	public TextFile(String fileName){
		this.fileName = fileName;
	}
	@Override
	public void killVirus() {
		System.out.println("杀死文本文件"+fileName+"的病毒！");
	}
}
