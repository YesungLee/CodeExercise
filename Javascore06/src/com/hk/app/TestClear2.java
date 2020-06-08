package com.hk.app;

import java.io.IOException;

public class TestClear2 {

	public static void main(String[] args) {
		int x = 1;
		while (true) {
			clearConsole(); // 화면지우기
			System.out.println(x + "초");
			x++;
			try {
				Thread.sleep(1000); // 1초간 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (x>100) { break; }
		}
	}
	
	public final static void clearConsole() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	}

}
