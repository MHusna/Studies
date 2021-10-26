package DistinctArray;

public class ArrayToDistinctArray {

	int[] toDistinctArray(int[] array) {

		int[] copyArray = arrayGenerator(array);

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					copyArray[j] = 0;
				}
			}
		}
		return copyArray;
	}

	void printArray(int[] array) {
		for (int iter : array) {
			if (iter != 0)
				System.out.print(iter + " ");
		}
	}

	int[] arrayGenerator(int[] array) {

		int[] newArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
