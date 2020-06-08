ackage chap04;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		boolean run = true;
		int input = 0, x, y;
		
		while(run) {
			if(input == 0) {
				System.out.println("--------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("--------------------");
				System.out.print("선택 > ");
				}
			Scanner scan = new Scanner(System.in);
			if(input == 1) {
				System.out.print("예금액 >");
				x = scan.nextInt();
			} else if (input == 2) {
				System.out.print("출금액 >");
				y = scan.nextInt();
			} else if (input == 3) {
				System.out.println("잔고 : ");
			} else if (input == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
