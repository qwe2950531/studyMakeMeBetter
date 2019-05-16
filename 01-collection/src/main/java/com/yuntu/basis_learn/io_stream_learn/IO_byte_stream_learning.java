package com.yuntu.basis_learn.io_stream_learn;

import java.io.*;

/**
 * @author Administrator
 */
public class IO_byte_stream_learning {
	public static void main(String[] args) {
		// 文件流
		try {
			InputStream inputStream  = new FileInputStream(new File("D:\\data\\ideaWorkspace\\distributed\\study\\story.txt"));
			FileDescriptor fd = ((FileInputStream) inputStream).getFD();
			fd.valid();
			byte[] bytes = new byte[inputStream.available()];
			inputStream.read(bytes);
			File file = new File("D:\\data\\ideaWorkspace\\distributed\\study\\newStory.txt");
			file.createNewFile();

			OutputStream outputStream = new FileOutputStream(file);
			outputStream.write(bytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
