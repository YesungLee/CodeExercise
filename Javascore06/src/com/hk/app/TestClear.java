package com.hk.app;
import java.io.IOException;
public class TestClear {

	public static void main(String[] args) {
		clearConsole();
		System.out.println("hello");
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
