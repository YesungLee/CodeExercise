package chap04;

public class ex01 {

	public static void main(String[] args) {
		int x = 1, sum = 0;
		for (int i = 0; i<100; i++)
		{
			if ( x % 3 == 0) {
				sum += x;
			}
			x++;
		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}
