package chap03;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534; // 연필 변수 선언
		int students = 30; // 학생 변수 선언
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println("학생 한 명당 연필 수 : " + pencilsPerStudent + "자루");
		
		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println("남은 연필 수 : " + pencilsLeft + "자루");

	}

}
