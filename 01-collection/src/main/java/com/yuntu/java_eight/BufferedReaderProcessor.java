package com.yuntu.java_eight;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
	public String readFile(BufferedReader br) throws IOException;
}
