package chap04;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int input = 0, x = 0, y = 0;
		
		while(run) {
			if(input != 13 && input != 10) // 엔터를 입력받지 못하도록 설정
			{
				System.out.println("--------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("--------------------");
				System.out.print("선택 > ");
			}
			
			input = System.in.read();
			Scanner scan = new Scanner(System.in);
			
			if(input == 49) {
				System.out.print("예금액 >");
				x = scan.nextInt();
			} else if (input == 50) {
				System.out.print("출금액 >");
				y = scan.nextInt();
			} else if (input == 51) {
				System.out.println("잔고 : " + (x-y));
			} else if (input == 52) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
