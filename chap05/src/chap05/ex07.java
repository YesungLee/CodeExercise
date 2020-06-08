package chap05;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[3];
		a[0] = "Java";
		a[1] = "Java";
		a[2] = new String("Java"); // 새 String 객체 생성
		
		System.out.println(a[0] == a[1]);
		System.out.println(a[0] == a[2]); // a[2]는 새 객체를 생성하므로 false
		System.out.println(a[0].equals(a[0])); // 문자열 비교

	}

}
