package SecondTierEquation;
import java.util.Scanner;

public class EquationSolutionTest {

	public static void main(String[] args) {
		
		System.out.println("ax^2+bx+c=0");
		Scanner number = new Scanner(System.in);
		int a, b, c;
		System.out.print("a: ");
		a = number.nextInt();
		System.out.print("b: ");
		b = number.nextInt();
		System.out.print("c: ");
		c = number.nextInt();
		
		System.out.println("******************");
		System.out.println("Your equation is: ");
		System.out.println(a + "x^2 + " + b + "x + " + c +" = 0");
		System.out.println("If equation not true please run again with true parameters!");
		
		EquationSolution object = new EquationSolution();
		object.equation(a, b, c);

	}

}
