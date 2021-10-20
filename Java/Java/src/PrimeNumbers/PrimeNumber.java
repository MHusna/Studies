package PrimeNumbers;

public class PrimeNumber {

	void isItPrime(int number) {

		int iter = 1;
		boolean result = false;
		if (number == 1 || number == 2)
			showResult(true, number);
			
		else {
			loop: for (; iter <= (number / 2); iter++) {
				if (iter != 1 & (number % iter) == 0) {
					result = false;
					break loop;
				}
				else
					result = true;
			}
			showResult(result, number);
		}
	}

	void detectThePrimes(int number) {
		int iter = 1;
		for (; iter <= number; iter++) {
			isItPrime(iter);
		}

	}
	
	void showResult(boolean result, int number) {
		if(result) {
			System.out.println(number+" is prime.");
		}
		else {
			System.out.println(number+" is not prime.");
		}
		
	}
}
