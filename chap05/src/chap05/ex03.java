package chap05;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3]; // 값을 가지고 있지 않는 3개의 길이에 배열 변수 arr1 선언
		for(int i=0; i<3; i++) {
			// 출력은 하였으나 값이 지정되지 않았으므로 0의 값을 갖는다.
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3]; // 실수형  arr2 배열 변수 선언
		for(int i=0; i<3; i++) {
			// 출력은 하였으나 값이 지정되지 않았으므로 0의 값을 갖는다.
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3]; // String 형식의 arr3 배열 변수 선언
		for(int i=0; i<3; i++) {
			// 출력은 하였으나 값이 지정되지 않았으므로 null을 갖는다.
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
