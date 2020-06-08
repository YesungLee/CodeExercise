package exam;
import java.util.Scanner; // scanner 클래스 불러오기
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // scanner 객체 생성
		System.out.println("두 개의 수를 입력하세요 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a % 2;
		int d = b % 3;
		System.out.println("2로 나눈 나머지 : " + c);
		System.out.println("3으로 나눈 나머지 : " + d);
		
	}

}