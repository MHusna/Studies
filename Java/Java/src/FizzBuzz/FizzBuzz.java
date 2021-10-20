package FizzBuzz;

public class FizzBuzz {

	void fizzBuzz(int entry) {
		
		int iter = 1;
		for(; iter <= entry ; iter++) {
			if(iter % 15 == 0) {
				System.out.println();
				System.out.println();
			}
			if(iter % 3 == 0 & iter % 5 != 0) {
				System.out.print("    Fizz");
			}
			else if(iter % 5 == 0 & iter % 3 != 0) {
				System.out.print("    Buzz");
			}
			else if(iter % 3 == 0 & iter % 5 == 0) {
				System.out.print("FizzBuzz");
			}
			else {
				if(iter < 10)
					System.out.print("       "+iter);
				else
					System.out.print("      "+iter);
			}
		}
	}
}
