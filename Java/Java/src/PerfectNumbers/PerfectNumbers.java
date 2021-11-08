package PerfectNumbers;

public class PerfectNumbers {

	void calculatePerfect(int number) {
		int sumOfDividers = sumOfDividers(number);

		if (number == sumOfDividers)
			System.out.println(number + " is a Perfect Number.");
		else
			System.out.println(number + " is not a Perfect Number.");
	}

	void calculatePerfectUntilRange(int number) {
		int i = 1;
		for (; i <= number; i++) {
			calculatePerfect(i);
		}
	}

	int sumOfDividers(int number) {
		int i = 1, sum = 0;
		for (; i < ((number / 2) + 1); i++) {
			if (number % i == 0) {
				sum += i;
				//System.out.println("i: " + i + " sum: " + sum);
			}
		}
		return sum;
	}
}
