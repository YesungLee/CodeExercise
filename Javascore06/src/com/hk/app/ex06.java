package com.hk.app;
import java.util.*;
public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int num[] = new int[1];
		int n = 0, cnt = 1;
		
		// 랜덤 숫자의 자릿수가 중복이 되면 다시 랜덤한 숫자를 뽑는다.
		while (true) {
			if (num[0] % 10 == num[0] % 100/10) {
				num[0] = rnd.nextInt(89) + 10;
			} else { break; }
		}
		
		// 숫자 입력 및 비교
		while (true) {
			System.out.print("두 자리의 숫자를 입력하세요 > ");
			n = sc.nextInt();
			if (n<10 || n % 10 == n % 100/10) {
				System.out.println("자리 숫자가 중복이거나 10을 넘지 못합니다.");
			} else if (n > num[0]) {
				System.out.println("숫자가 높습니다.");
				cnt++;
			} else if (n < num[0]) {
				System.out.println("숫자가 작습니다.");
				cnt++;
			} else {
				System.out.println("정답입니다.");
				break;
				}
		}
		
		// 출력
		System.out.println("입력 횟수 : " + cnt);
		System.out.println("정답 : " + num[0]);
	}
}
