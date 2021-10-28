package Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue object = new Queue();
		
		System.out.println("!--- INSERT 1 ELEMENT ---!");
		object.queue("Mehmet");
		object.showElements();
		
		System.out.println("\n\n!--- INSERT MANY ELEMENT ---!");
		object.queue("Ahmet");
		object.queue("Derin");
		object.queue("Kasım");
		object.queue("Fehmi");
		object.showElements();
		
		
		System.out.println("\n\n!--- Dequeue ---!");
		System.out.println("Dequeue element is: "+object.dequeue());
		object.showElements();
		
		System.out.println("\n\n!--- Clear ---!");
		object.clear();
		object.showElements();
		
		System.out.println("\n\n!--- isEmpty ---!");
		System.out.println(object.isEmpty());
		
		System.out.println("\n\n!--- isFull ---!");
		System.out.println(object.isFull());
		
		System.out.println("\n\n!--- Size ---!");
		System.out.println(object.size());
		
		System.out.println("\n\n!--- Get Capacity ---!");
		System.out.println(object.getCapacity());
	}

}
