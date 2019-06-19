package com.yuntu.basis_learn.design_parttern.composite;

import lombok.Data;

import java.util.List;

/**
 * @author wang_lei
 * 文件夹
 */
@Data
public class Folder implements AbstractFile {
	private String folderName;
	private List<AbstractFile> list;
	public Folder(List<AbstractFile> list,String folderName){
		this.list = list;
		this.folderName = folderName;
	}
	@Override
	public void killVirus() {
		System.out.println("杀死文件夹"+folderName+"病毒");
		list.forEach(AbstractFile::killVirus);
	}

	public void add(AbstractFile file){
		list.add(file);
	}

	public void remove(AbstractFile file){
		list.remove(file);
	}

	public AbstractFile getChild(int index){
		return list.get(index);
	}
}
