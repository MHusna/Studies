package ReverseNumber;

public class Reverse {

	 String reverse(int number) {
		String newNumber = "";
		int digit = 0;
		
		while(number > 0) {
			digit = number % 10;
			newNumber += String.valueOf(digit);
			number = number-digit;
			number /= 10;
		}
		
		return newNumber;	
	}
}
