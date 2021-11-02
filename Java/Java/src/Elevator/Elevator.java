package Elevator;

public class Elevator {

	private final int maxFloor;
	private final int maxCarryPerson;
	boolean doorIsOpen;
	int currentFloor;
	int currentPerson;

	Elevator() {
		this.maxFloor = 0;
		this.doorIsOpen = false;
		this.maxCarryPerson = 0;
	}

	Elevator(int maxFloor, int maxCarryPerson, boolean doorIsOpen, int currentFloor) {
		this.maxFloor = maxFloor;
		this.doorIsOpen = doorIsOpen;
		this.maxCarryPerson = maxCarryPerson;
		this.currentFloor = currentFloor;
	}

	void up() {
		if (currentFloor != maxFloor)
			currentFloor++;
		else
			System.out.println("ALERT !!!! You are already in max floor...");
	}

	void down() {
		if (currentFloor != 0)
			currentFloor--;
		else
			System.out.println("ALERT !!!! You are already in ground floor...");
	}

}
