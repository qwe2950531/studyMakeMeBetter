package com.yuntu.basis_learn.io_stream_learn;

import java.io.File;

public class File_API_learning {
	public static void main(String[] args) {
		// 创建File对象的四种方式
		File fileOne = new File("\\");
		File fileTwo = new File("D:\\data\\ideaWorkspace\\distributed\\study\\01-collection\\src\\main\\resources","story.txt");
		File fileTree = new File(new File("D:\\data\\ideaWorkspace\\distributed\\study\\01-collection\\src\\main\\resources"),"story.txt");
//		File fileFour = new File(URI.create("ss"));
		// 创建文件
//		try {
//			fileOne.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		// 获取文件路径 创建时是绝对路径就是绝对路径 是相对路径就是相对路径
//		System.out.println(fileOne.getPath());
//
//		// 创建多级目录
//		fileOne.mkdirs();
//
//		// 创建一级目录
//		System.out.println(fileOne.mkdir());
//
//		// 判断文件是否存在
//		fileOne.exists();
//
//		// 获取文件名称
//		fileOne.getName();
//
		// 判断文件是否为目录
//		fileOne.isDirectory();
//
//		// 判断是否包含绝对路径
//		fileOne.isAbsolute();
//
//		// 判断是否为文件
//		fileOne.isFile();
//
//		// 判断是否隐藏
//		fileOne.isHidden();
//
//		// 列出目录下所有文件
//		fileOne.listFiles();
//
//		// 列出目录下所有文件名
//		Arrays.asList(fileOne.list()).forEach(System.out::println);
//
//		// 根据FilenameFilter 列出文件名
//		Arrays.asList(fileOne.list((file,name) -> name.contains("."))).forEach(System.out::println);
//
//		// 根据fileFilter列出文件list
//		fileOne.listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return false;
//			}
//		});
//
//		// 根据filenameFilter累出文件list
//		fileOne.listFiles(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
//				return false;
//			}
//		});
//
//		// 获取父路径
//		fileOne.getParent();
//
//		// 获取父文件
//		fileOne.getParentFile();
//
//
//
//		// 跟别的文件对象比较
//		fileOne.compareTo(new File("ss"));
//
//		// 删除文件
//		fileOne.delete();
//
//		// 当文件存在时删除文件
//		fileOne.deleteOnExit();
//
//		// 获取绝对路径文件对象
//		fileOne.getAbsoluteFile();
//
//		// 获取文件绝对路径
//		fileOne.getAbsolutePath();
//
//		// 获取剩余空间
//		fileOne.getFreeSpace();
//
//		fileOne.getTotalSpace();
//
//		fileOne.getUsableSpace();
//
//		fileOne.lastModified();
//
//		// 获取路径解析后的文件对象
//		fileOne.getCanonicalFile();
//
//		// 将绝对路径解析后返回
//		fileOne.getCanonicalPath();
//
//
//		// 判断是否可执行
//		fileOne.canExecute();
//
//		// 判断是否可读
//		fileOne.canRead();
//
//		// 判断是否可写
//		fileOne.canWrite();
//
//		// 设置执行权限
//		fileOne.setExecutable();
//		fileOne.setExecutable();
//
//		// 设置最后修改时间
//		fileOne.setLastModified();
//
//		// 设置可读权限
//		fileOne.setReadable();
//		fileOne.setReadable();
//
//		// 设置只读
//		fileOne.setReadOnly();
//
//		// 设置可写权限
//		fileOne.setWritable();
//		fileOne.setWritable();


	}
}
