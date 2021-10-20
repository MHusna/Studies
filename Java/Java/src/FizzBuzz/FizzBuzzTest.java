package FizzBuzz;
import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		System.out.print("Welcome! Give a number: ");
		FizzBuzz object = new FizzBuzz();
		object.fizzBuzz(entry.nextInt());

	}

}
