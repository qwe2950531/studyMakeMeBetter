package com.yuntu.basis_learn.design_parttern.prototype;

import java.io.*;
import java.util.Date;

public class RefectClone {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date birth = new Date();
		Ship ship = new Ship();
		ship.setBir(birth);
		ship.setName("多利");
		ship.setAge(11);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(ship);
		byte[] bytes = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Ship newShip = (Ship)ois.readObject();
		birth.setTime(123213123123L);
		//本身的对象
		System.out.println(ship);
		//修改日期对象的属性
		//经过字节流克隆的对象
		System.out.println(newShip);


	}
}
