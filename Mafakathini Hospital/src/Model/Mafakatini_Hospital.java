package Model;

public class Mafakatini_Hospital {

	public static void main(String[] args) {
	
		

		Manager manager = new Manager(22174375, "Kwanele Ntshele", "Leadership and Management", "2019-02-17", 2200, "Kwanele@2217");
	    Doctor doctor = new Doctor(22003412, "Dr David Jones", "Health Dep and Operations", "2021-02-17", 2550, "David@2200");
	    Nurse nurse = new Nurse(22175678, "Rebecca Nadioo","Labour and Operations Dep.","2022-02-10", 1200, "Rebecca@2217");
	    
	    
	    manager.login();
	    doctor.work();
	    nurse.work();
	    manager.work();

	}

}
