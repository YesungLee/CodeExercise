package com.hk.app.game;

public class Map {

	public static void main(String[] args) { 
	
		System.out.println("맵 화면");
		Character[] ch = new Character[10];
		ch[0] = new House();
		ch[1] = new House();
		
		for (int i=0; i<ch.length; i++) {
			ch[i].x = i;
		}
		// House h = new Character(); 불가능
		
	}

}
