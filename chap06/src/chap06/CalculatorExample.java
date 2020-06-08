package chap06;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn(); // powerOn 메소드 실행
		
		int result1 = myCalc.plus(5, 6); // plus 메소드 실행
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // divide 메소드 실행
		System.out.println("result2 : " + result2);
		myCalc.powerOff();
	}

}
