package Queue;

public class Queue {

	public static final int MAX_QUEUE_SIZE = 10;
	String[] queue = new String[10];

	public void queue(String newElement) {
		if (isFull()) {
			System.out.println("Queue is full...");
		} else if (isEmpty()) {
			queue[0] = newElement;
		} else {
			int sizeOfQueue = size();
			queue[sizeOfQueue] = newElement;
		}
	}

	public String dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty...");
			return null;
		} else {
			int sizeOfQueue = size();
			String temp = null;
			loop: for (int i = 0; i < sizeOfQueue; i++) {
				if (queue[i] != null) {
					temp = queue[i];
					int j = 0;
					while(j < sizeOfQueue) {
						queue[j] = queue[j+1];
						j++;
					}
					break loop;
				}
			}
			return temp;
		}
	}

	public void clear() {
		int size = size();
		if (!isEmpty()) {
			for (int i = 0; i < size; i++) {
				queue[i] = null;
			}
		}
	}

	public boolean isEmpty() {
		int size = size();
		return (size == 0) ? true : false;
	}

	public boolean isFull() {
		int size = size();
		return (size == 10) ? true : false;
	}

	public int size() {
		int counter = 0;
		for (String string : queue) {
			if (string != null)
				counter++;
		}
		return counter;
	}

	public int getCapacity() {
		return MAX_QUEUE_SIZE;
	}

	public void showElements() {
		for (String string : queue) {
			System.out.print(string + " ");
		}
	}
}
