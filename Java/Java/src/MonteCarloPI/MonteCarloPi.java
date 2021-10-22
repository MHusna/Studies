package MonteCarloPI;

import java.util.Iterator;

public class MonteCarloPi {

	double isInCircle(int numberOfPoints) {
		
		int numberInCircle = 0;
		int iter = 0;
		
		for(; iter <= numberOfPoints; iter++) {
			double x = Math.random();
			double y = Math.random();
			double distance = (x*x)+(y*y);
			
			if(distance <= 1)
				numberInCircle++;
		}
		
		double calculatedPI = calculatePI(numberInCircle,numberOfPoints);
		return calculatedPI;
	}
	
	double calculatePI(int numberInCircle, int numberOfPoints) {
		
		double myPI = (4.0 * numberInCircle) /  numberOfPoints;
		return myPI;
	}
}
