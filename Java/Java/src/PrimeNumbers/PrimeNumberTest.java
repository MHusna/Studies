package PrimeNumbers;
import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		PrimeNumber object = new PrimeNumber();
		
		System.out.println("Welcome! Make a choise please.");
		System.out.println("1- You can control only one number.");
		System.out.println("2- You can control all of the numbers until your entry number.");
		System.out.print("CHOISE: ");
		
		int choise = entry.nextInt();
		if(choise == 1) {
			System.out.print("Enter the number what you want to control: ");
			object.isItPrime(entry.nextInt());	
		}
		else {
			System.out.print("Enter the last number: ");
			object.detectThePrimes(entry.nextInt());
		}
	}

}
