package Divisor;

public class Divisor {

	int[] findAllDivisor(int number) {

		int[] divisorArray = new int[number];

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				divisorArray[i - 1] = i;
			} else {
				divisorArray[i] = 0;
			}
		}
		return divisorArray;
	}
}
