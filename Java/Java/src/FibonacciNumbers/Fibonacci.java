package FibonacciNumbers;

public class Fibonacci {
	private int firstNumber = 0;
	private int secondNumber = 1;

	void printFibonacciNumbers(int range) {
		int i = 0, temp = 0;
		while (i < range) {
			temp = firstNumber + secondNumber;
			System.out.println("i: " + i + " fibonacci number: " + temp);
			firstNumber = secondNumber;
			secondNumber = temp;
			i++;
		}
	}
}
