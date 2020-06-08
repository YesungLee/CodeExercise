package com.hk.app;
import java.util.*;
public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n[] = new String[5];
		int x = 0;
		
		for (int i=0; i<n.length; i++) {
			n[i] = sc.nextLine();
		}
		
		for (int i=0; i<3; i++) {
			System.out.println(n[x]);
			x += 2;
		}
	}

}
