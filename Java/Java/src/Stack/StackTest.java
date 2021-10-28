package Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack object = new Stack();
		System.out.println("Stack max size: "+object.MAX_STACK_SIZE);
		
		System.out.println("##### PUSH #####");
		object.push("Mehmet");
		object.showElements();
		
		System.out.println("\n\n##### POP #####");
		object.pop();
		object.showElements();
		
		System.out.println("\n\n##### CLEAR #####");
		//Get ready stack for clear.
		System.out.println("##### CURRENT STACK #####");
		object.push("Mehmet");
		object.push("Harun");
		object.push("Ishak");
		object.push("Deniz");
		object.showElements();
		System.out.println("\n##### AFTER THE CLEAR #####");
		object.clear();
		object.showElements();
		
		System.out.println("\n\n##### isEmpty #####");
		System.out.println(object.isEmpty());
		
		System.out.println("\n\n##### isFull #####");
		System.out.println(object.isFull());
		
		System.out.println("\n\n##### SIZE #####");
		System.out.println(object.size());
		
		System.out.println("\n\n##### CAPACITY #####");
		System.out.println(object.getCapacity());
	}

}
