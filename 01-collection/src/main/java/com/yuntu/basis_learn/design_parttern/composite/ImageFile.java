package com.yuntu.basis_learn.design_parttern.composite;

import lombok.Data;

/**
 * @author wang_lei
 * 图片文件
 */
@Data
public class ImageFile implements AbstractFile {
	private String fileName;
	public ImageFile(String fileName){
		this.fileName = fileName;
	}
	@Override
	public void killVirus() {
		System.out.println("---查杀文件"+fileName+"，进行查杀!");
	}
}
