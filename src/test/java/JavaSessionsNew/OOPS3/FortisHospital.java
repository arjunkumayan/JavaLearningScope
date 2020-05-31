package JavaSessionsNew.OOPS3;

public class FortisHospital implements USMedical, UKMedical, IndiaMedical {

	public void cardioServices() {
		System.out.println("fortis - cardioServices");
		System.out.println("total doctors: " + 5);
	}

	@Override
	public void oncologyServices() {
		System.out.println("fortis - oncologyServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("fortis - neuroServices");

	}

	@Override
	public void medicalInsurance() {
		System.out.println("fortis - medicalInsurance");
	}

	@Override
	public void physioServices() {
		System.out.println("fortis - physioServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("fortis - dentalServices");
	}

	@Override
	public void ambulanceServices() {
		System.out.println("fortis - ambulanceServices");
	}

	@Override
	public void ENTServices() {
		System.out.println("fortis - ENTServices");
	}

	@Override
	public void OPTServices() {
		System.out.println("fortis - OPTServices");
	}

	@Override
	public void doctorsInternship(int doctors) {
		System.out.println("total doctors eligible for internship: "+ doctors);
	}

	@Override
	public void doctorsInternship(int doctors, int nurse) {
		System.out.println("total doctors and nurses eligible for internship: "+ doctors + " " + nurse);
	}
	

	public void freeCamp(){
		System.out.println("fortis - free camps");
	}
	
	public void pathologyServices(){
		System.out.println("fortis - pathologyServices");
	}

}
