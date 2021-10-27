package SieveOfEratosthenes;

public class Algortihm {
	
	int[] makeArray(int firstValue, int number) {

		int[] createdArray = new int[number - 1];

		for (int i = 0; i < number - 1; i++) {
			createdArray[i] = firstValue + i;
		}
		return createdArray;
	}

	
	int[] algorithmOfEratosthenes(int number) {
		
		int prime = 2;
		int[] createdArray = makeArray(prime, number);
		
		for(; prime < number; prime++) {
			for(int i = prime - 1; i < number - 1; i++) {
				if(createdArray[i] % prime == 0) {
					createdArray[i] = 0;
				}
			}
		}
		
		return createdArray;
	}

}
