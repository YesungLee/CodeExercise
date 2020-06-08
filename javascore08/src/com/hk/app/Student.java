package com.hk.app;

public class Student {
	// 필드
	int id;
	String name;
	
	// 메소드
	void SetId(int si) { id = si; }
	void SetName(String sn) { name = sn; }
	void GetId() { System.out.println(id); }
	void GetName() { System.out.println(name); }
}
