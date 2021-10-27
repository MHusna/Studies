package Divisor;

public class DivisorTest {

	public static void main(String[] args) {
		
		Divisor object = new Divisor();
		int[] divisorArray = object.findAllDivisor(100);
		
		for (int i : divisorArray) {
			if(i != 0)
				System.out.print(i+" ");
		}
	}

}
