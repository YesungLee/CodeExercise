package com.hk.app;

public class StringBuf {

	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("초기문자열");
		sbf.append("abcdefg");
		sbf.append("+sad");
		
		String str = sbf.toString();
		System.out.println(str);
		
		String exp = "2 ";
		exp += "+";
		exp += " 1.3125 ";
		exp += "*";
		exp += "23";
		System.out.println(exp);
	}

}
