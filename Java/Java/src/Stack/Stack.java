package Stack;

public class Stack {

	public static final int MAX_STACK_SIZE = 10;
	String[] stack = new String[MAX_STACK_SIZE];

	public void push(String newElement) {

		if (isFull()) {
			System.out.println("Stack is full...");
		} else if (isEmpty()) {
			stack[0] = newElement;
		} else {
			int sizeOfStack = size();
			stack[sizeOfStack] = newElement;
		}
	}

	public String pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
			return null;
		} else {
			int sizeOfStack = size();
			String temp = stack[sizeOfStack - 1];
			stack[sizeOfStack - 1] = null;
			return temp;
		}
	}

	public void clear() {
		int sizeOfStack = size();

		for (int i = 0; i < sizeOfStack; i++) {
			stack[i] = null;
		}
	}

	public boolean isEmpty() {

		int size = size();

		if (size == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		int size = size();
		if (size == MAX_STACK_SIZE)
			return true;
		else
			return false;
	}

	public int size() {
		int counter = 0;
		for (String string : stack) {
			if (string != null)
				counter++;
		}

		return counter;
	}

	public int getCapacity() {
		return MAX_STACK_SIZE;
	}

	public void showElements() {
		for (String string : stack) {
			System.out.print(string + " ");
		}
	}
}
