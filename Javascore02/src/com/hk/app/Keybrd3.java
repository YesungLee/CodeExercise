package com.hk.app;
import java.util.Scanner;
public class Keybrd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요. > ");
		String name = scan.nextLine();
		System.out.println("이메일을 입력하세요. > ");
		String email = scan.nextLine();
		System.out.println("이름은 : " + name + "입니다.");
		System.out.println("이메일은 : " + email + "입니다.");

	}

}
