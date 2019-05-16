package com.yuntu.basis_learn.java_eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wang_lei
 */
public class ExecuteAroundMode {
	public static void main(String[] args) {
		try {
			System.out.println(processFile(br -> br.readLine()+br.readLine()+br.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String processFile(BufferedReaderProcessor bufferedReaderProcessor)throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\data\\ideaWorkspace\\distributed\\study\\01-collection\\src\\main\\resources\\story.txt"));
		return bufferedReaderProcessor.readFile(bufferedReader);
	}
}
