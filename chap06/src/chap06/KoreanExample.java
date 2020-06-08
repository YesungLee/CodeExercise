package chap06;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Korean 클래스에 name과 n은 선언을 하지 않았으나, 아래처럼 입력하면 자동으로 입력된다.
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

	}

}
