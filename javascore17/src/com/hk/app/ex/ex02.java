package com.hk.app.ex;

import java.util.Vector;

public class ex02 {

	public static void main(String[] args) {
		// 벡터 클래스
		Vector family = new Vector();
		Person ps = new Person();
		ps.setName("grandFa");
		ps.setAge(70);
		family.add(ps.getName());
		family.add(ps.getAge());
		

		for (int i = 0; i < family.size(); i++)
			System.out.println(family.get(i));
	}

}
