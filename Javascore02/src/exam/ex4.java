package exam;
import java.util.Scanner; // scanner 클래스 불러오기
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // scanner 객체 생성
		System.out.println("반지름 값을 입력하세요 : ");
		int a = scanner.nextInt(); // 반지름 값을 입력받음
		double b = a * a * 3.14; // 실수형으로 정의해야 소수를 저장할 수 있음
		System.out.println("원의 면적 : " + b); // 출력
		
	}

}
