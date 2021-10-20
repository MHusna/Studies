package PhotocopyPrice;

import java.util.Scanner;

public class PriceCalculatorTest {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		PriceCalculator object = new PriceCalculator();
		
		System.out.print("Welcome! How many copy you want ?: ");
		double price = object.calculateMinPrice(entry.nextInt());
		System.out.println(price);
	}

}
