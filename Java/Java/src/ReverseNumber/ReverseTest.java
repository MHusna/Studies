package ReverseNumber;
import java.util.Scanner;

public class ReverseTest {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		Reverse object = new Reverse();
		
		System.out.print("Number: ");
		String result = object.reverse(entry.nextInt());
		System.out.println("Reverse number: "+result);

	}

}
