package DistinctArray;

public class ArrayToDistinctArrayTest {

	public static void main(String[] args) {

		ArrayToDistinctArray object = new ArrayToDistinctArray();
		int[] array = { 3, 3, 87, 56, 1, 87, 3, 2 };
		int[] secondArray = new int[array.length];

		System.out.print("Before: ");
		object.printArray(array);
		System.out.println("\n\n**************\n");

		secondArray = object.toDistinctArray(array);
		System.out.print("After: ");
		object.printArray(secondArray);
	}

}
