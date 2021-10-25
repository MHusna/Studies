package PasswordControl;

import java.util.Scanner;

public class PasswordController {

	void controller() {
	
		String pass = "aB.qZo1_W*";
		int chance = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the password: ");
		String entry = scan.next();
		
		loop: do {
			if(pass.equals(entry)) {
				System.out.println("Pass verified.");
				break loop;
			}
			else {
				if(chance == 5) {
					System.out.println("You must wait 30 sec.");
					break loop;
				}
				chance++;
				System.out.print("Try again: ");
				entry = scan.next();
			}
		
		}while(chance <= 5);
	}

}
