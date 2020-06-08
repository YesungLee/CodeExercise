package chap07;

public class Student extends People{ // People 클래스 상속 받음
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		// TODO Auto-generated method stub
		super(name, ssn); // 부모 생성자 호출
		this.studentNo = studentNo;
	}

}
