package chap05;
import java.util.Scanner;
public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------");
			System.out.print("선택>");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scan.nextInt(); // 입력 받은 학생 수를 studentNum 변수에 입력
				scores = new int[studentNum]; // scores 배열에 입력된 studentNum 길이를 부여
			} else if(selectNo == 2) {
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scan.nextInt();
				}
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i])? scores[i]: max;
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}
