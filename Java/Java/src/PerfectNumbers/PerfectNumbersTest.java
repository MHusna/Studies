package PerfectNumbers;

public class PerfectNumbersTest {

	public static void main(String[] args) {
		PerfectNumbers object = new PerfectNumbers();
		//It's OK.
		//object.calculatePerfect(28);
		System.out.println("------------------------");
		object.calculatePerfectUntilRange(200);
	}

}
