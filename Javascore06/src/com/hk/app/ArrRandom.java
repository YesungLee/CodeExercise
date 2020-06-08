package com.hk.app;
import java.util.*;
public class ArrRandom {

	public static void main(String[] args) {
		int ran[] = new int[10];
		Random zen = new Random();
		
		for (int i=0; i<ran.length; i++) {
			ran[i] = zen.nextInt(10)+1;
		}
		
		for (int i=0; i<ran.length; i++) {
			if (ran[i] % 2 == 0) {
				System.out.print(ran[i] + " ");
			}
		}
		System.out.println();
		
		for (int i=0; i<ran.length; i++) {
			if (ran[i] % 2 == 1) {
				System.out.print(ran[i] + " ");
			}
		}
	}

}
