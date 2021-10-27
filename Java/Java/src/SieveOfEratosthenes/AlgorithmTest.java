package SieveOfEratosthenes;

public class AlgorithmTest {

	public static void main(String[] args) {
		
		Algortihm object = new Algortihm();
		int[] array = object.algorithmOfEratosthenes(100);
		
		for (int i : array) {
			if(i != 0)
				System.out.print(i+" ");
		}
		
	}
}
