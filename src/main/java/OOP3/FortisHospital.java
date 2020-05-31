package OOP3;

public class FortisHospital implements USMedical, UKMedical {

	@Override
	public void cardioServices() {
		
		System.out.println("fortis-- cardio services");
		System.out.println("total doctors: "+5);
	}

	@Override
	public void oncologlogyServices() {
		System.out.println("fortis-- oncology services");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("fortis-- neuro services");
		
	}

	@Override
	public void insuranceService() {
		System.out.println("fortis- - insurance services");
		
	}

		  // these are method overloading
	@Override
	public void doctorsInternship(int doctors) {
		System.out.println("Total doctors eligible for internship: "+doctors);
		
	}

	@Override
	public void doctorsInternShip(int doctors, int nurse) {
		System.out.println("total number of doctor and nurse eligible for internship"+doctors+"+nurse");
		
	}

	@Override
	public void physioServices() {
		System.out.println("fortis - physio services");
		
	}

	@Override
	public void dentalServices() {
	System.out.println("fortis-- dental services");
		
		
	}
	
	public void freeCamp()
	{
		System.out.println("fortis- free cmps");
	}
	 
	public void pathologyServices()
	{
		System.out.println("fortis - pathology services");
	}
	
	
	// interface to provide the abstract layer
	// how exactly you provide the services that is upto t you bu t
	// services should be there
	

}
