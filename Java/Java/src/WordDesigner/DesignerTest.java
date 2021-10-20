package WordDesigner;
import java.util.Scanner;

public class DesignerTest {

	public static void main(String[] args) {
		Designer object = new Designer();
		Scanner entry = new Scanner(System.in);
		
		System.out.print("Give a word! : ");
		String designedWord = object.design(entry.next());
		System.out.println(designedWord);
	}

}
