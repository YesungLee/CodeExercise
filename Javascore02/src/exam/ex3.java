package exam;
import java.util.Scanner; // scanner 클래스 불러오기
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // scanner 객체 생성
		System.out.println("두 개의 수를 입력하세요 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = a * b;
		System.out.println("두 수의 곱 : " + c); // 두 수의 곱 출력
		
	}

}
