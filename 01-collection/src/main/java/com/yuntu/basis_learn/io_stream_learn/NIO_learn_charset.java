package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.Set;

/**
 * @author wang_lei
 * 字符集
 * 编码： 字符串->字节数组
 * 解码： 字节数组->字符串
 */
public class NIO_learn_charset {
	@Test
	public void test_charset(){
		Map<String, Charset> map = Charset.availableCharsets();
		Set<Map.Entry<String, Charset>> entries = map.entrySet();
		for(Map.Entry entry : entries){
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}

	//字符集操作
	@Test
	public void decode_encode() throws CharacterCodingException {
		Charset cs = Charset.forName("GBK");

		//编码器
		CharsetEncoder ce = cs.newEncoder();

		//解码器
		CharsetDecoder cd = cs.newDecoder();

		CharBuffer charBuffer = CharBuffer.allocate(1024);
		charBuffer.append("尚硅谷我爱你！");
		charBuffer.flip();
		ByteBuffer encode = ce.encode(charBuffer);

		CharBuffer decode = cd.decode(encode);
		System.out.println(decode.toString());
	}
}
