package exam;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Length = 20; // Length 변수에 20을 대입
		int Width = 30; // Width 변수에 30을 대입
		int Height = 40; // Height 변수에 20을 대입
		int Volume; // Volume 변수 선언
		
		Volume = Length * Width * Height;
		
		System.out.println("가로:\t" + Length); // 출력
		System.out.println("세로:\t" + Width);
		System.out.println("높이:\t" + Height);
		System.out.println("부피:\t" + Volume);
	}

}
