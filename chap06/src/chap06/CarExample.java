package chap06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 필드
		Car myCar = new Car(); // 클래스 변수인 myCar 선언, Car 클래스 불러오기
		
		// 필드 값 읽기
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
		// 필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);

	}

}
