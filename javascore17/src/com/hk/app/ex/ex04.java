package com.hk.app.ex;

import java.util.ArrayList;
import java.util.Iterator;

public class ex04 {

	public static void main(String[] args) {

		int sum = 0;
		int x = 0;
		ArrayList al = new ArrayList();
		while (x < 10) {
			al.add((int) (Math.random() * 89) + 10);
			x++;
		}

		Iterator it = al.iterator();
		while (it.hasNext()) {
			sum += (int) it.next();
		}
		/*
		 * for (int i = 1; i <= al.length; i++) { al[i].add((int) (Math.random() * 89) +
		 * 10); Iterator it = al[i].iterator(); while (it.hasNext()) { sum += (int)
		 * it.next(); } }
		 */
		System.out.println(sum);
	}
}
