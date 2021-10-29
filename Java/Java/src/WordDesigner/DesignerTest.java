package WordDesigner;
import java.util.Scanner;

public class DesignerTest {

	public static void main(String[] args) {
		Designer object = new Designer();
		Scanner entry = new Scanner(System.in);
		
		System.out.print("Give a word! : ");
		String word = entry.next();
		System.out.print("Give a special character! : ");
		String specialChar = entry.next();
		
		System.out.println("\n!--- New word ---!");
		System.out.println(object.design(word, specialChar));
	}

}
