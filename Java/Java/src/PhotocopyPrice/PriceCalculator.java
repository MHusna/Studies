package PhotocopyPrice;

public class PriceCalculator {
	
	Double calculateMinPrice(int numberOfPhotocopy) {
		int numberOfPhotocopiesMade = 0;
		int numberOfPhotocopiesRemaining = numberOfPhotocopy;
		double price = 0;
		
		while(numberOfPhotocopiesMade < numberOfPhotocopy) {
			if(numberOfPhotocopiesRemaining >= 25 && numberOfPhotocopiesRemaining % 25 >= 0) {
				price += 1.00;
				numberOfPhotocopiesMade += 25;
				numberOfPhotocopiesRemaining -= 25;
			}
			
			else if(numberOfPhotocopiesRemaining >= 12 && numberOfPhotocopiesRemaining % 12 >= 0) {
				price += 0.50;
				numberOfPhotocopiesMade += 12;
				numberOfPhotocopiesRemaining -= 12;
			}
			
			else {
				price += numberOfPhotocopiesRemaining * 0.05;
				numberOfPhotocopiesMade += numberOfPhotocopiesRemaining;
				numberOfPhotocopiesRemaining -= numberOfPhotocopiesMade;
			}
		}
		
		return price;
	}
}
	

