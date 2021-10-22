package MonteCarloPI;
import java.util.Scanner;

public class MonteCarloPiTest {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		MonteCarloPi object = new MonteCarloPi();
		
		System.out.print("Enter the number of points: ");
		double calculatedPI = object.isInCircle(entry.nextInt());
		System.out.println(calculatedPI);
		
		
	}

}
