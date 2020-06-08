package chap04;

public class ex02 {

	public static void main(String[] args) {
		int random=0, random2=0;		// 랜덤에 쓰이는 함수 선언
		while (random + random2 != 5) // 첫 번째 숫자와 두 번째 숫자를 더 해 5가 안나오면 반복
		{
		random = (int) (Math.random()*6) +1;
		random2 = (int) (Math.random()*6) +1;
		System.out.println("(" + random + ", " + random2 + ")");
		}
	}

}
