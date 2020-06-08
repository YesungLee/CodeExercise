package chap05;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
		// 소수 둘 째 자리에서 반올림
		System.out.println("평균 : " + String.format("%.1f", avg));
	}

}
