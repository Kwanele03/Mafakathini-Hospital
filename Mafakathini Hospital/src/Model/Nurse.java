package Model;

import java.util.Scanner;

import Services.NurseServices;

public class Nurse extends NurseServices {

	public Nurse(int iD, String fullName, String derpatment, String experience, double salary, String password) {
		super(iD, fullName, derpatment, experience, salary, password);
	}
	
	
	@Override
	public void work() {

		Scanner scanner = new Scanner(System.in);
		int duty;
		do {
		System.out.printf("Hi there %s. Check available responsibility: \n", this.getName());
		System.out.println("1. Appointment.");
		System.out.println("2. Treatment.");
		System.out.println("3. Operation.");
		System.out.println("4. Meeting.");
		System.out.print("Enter responsibilty by number: ");
		duty = scanner.nextInt();

		if (duty >= 1 || duty <= 4) {
		switch (duty) {
		case 1 ->  System.out.printf("You have an appointment %s. \n", this.getName());
		case 2 -> System.out.printf("You have patient to treatment %s. \n", this.getName()); 
		case 3 -> System.out.printf("You have no operation at the moment %s. \n", this.getName()); 
		case 4 -> System.out.printf("You have no meeting %s. \n", this.getName());
		}
	 } 
	break;	
   } while (duty != 4 );
		
     System.out.println("You are welcome!.");	
 	
	}
}

