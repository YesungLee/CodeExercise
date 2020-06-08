package chap05;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArray = {1,2,3,-4};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) { // i=0부터 3미만까지
			newIntArray[i] = oldIntArray[i];
		}
		for(int i=0; i<newIntArray.length; i++) { // i=0부터 5미만까지
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
