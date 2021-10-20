package SecondTierEquation;

public class EquationSolution {

	void equation(int a, int b, int c) {

		int powOfB = b ^ 2;
		int sqrtRightSide = 4 * a * c;
		int denominator = 2 * a;
		double sqrtResult = Math.sqrt((powOfB) - (sqrtRightSide));

		double firstRoot = ((-b) + (sqrtResult)) / denominator;
		double secondRoot = ((-b) - (sqrtResult)) / denominator;
		System.out.println("First root: " + firstRoot);
		System.out.println("Second root: " + secondRoot);

	}
}
