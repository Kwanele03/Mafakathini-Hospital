package Services;

import java.time.LocalDate;
import java.util.Scanner;

public class DoctorServices implements IDoctorServices {

	private int iD;
	public String fullName;
	private String derpatment;
	private LocalDate experience;
	private double salary;
	private String password;


	public DoctorServices(int iD, String fullName,  String derpatment, String experience, double salary, String password){
		this.iD = iD;
		this.fullName = fullName;
		this.derpatment = derpatment;
		this.experience = LocalDate.parse(experience);
		this.salary = salary;
		this.password = password;	
	}
	
	p
	ublic void login() {
		this.getID();
		this.getPassword();
       
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	
           System.out.print("Enter Your ID: ");
           int username = scanner.nextInt();
           scanner.nextLine();
           
           System.out.print("Enter password: ");
           String password = scanner.nextLine();

           if (username == this.getID() && password.equals(this.getPassword())) {
               System.out.println("Login successful!");
               break;
           } 
           else {
               System.out.println("Incorrect ID or password. Try again.");
           }   
       }
        
       scanner.close();
   }
	


	public int getID() {
		return this.iD;
	}


	public String getName() {
		return this.fullName;
	}


	public String getDepartment() {
		return this.derpatment;
	}


	public String getExperience() {
		return this.experience.toString();
	}


	public double getSalary() {
		
		int workingDays = 20;
		int months = 12;
		double annualSalary = (this.salary * workingDays) * months;
		return annualSalary;
	}


	public String getPassword() {
		return this.password;
	}
	
	public void work() {
		
	}
	

}



