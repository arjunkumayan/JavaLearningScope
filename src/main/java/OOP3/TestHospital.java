package OOP3;

public class TestHospital {

	public static void main(String[] args) {
		
	FortisHospital fs=new FortisHospital();
	fs.cardioServices();
	//fs.dentalServices();
	fs.insuranceService();
	fs.doctorsInternship(10);
	fs.doctorsInternShip(10, 20);
	fs.freeCamp();
	fs.pathologyServices();
	
	//USMedical us=new USMedical();
	
	
	//top casting
	USMedical us=new FortisHospital();
	us.cardioServices();
	us.oncologlogyServices();
	us.insuranceService();
	us.neuroServices();
	// can call only usmedical method
	// I can not call fortishospital class method which are coming from another class or fortis hospital 
	fs.logo();
	
	USMedical.parking();
	System.out.println(USMedical.min_fee);
	//USMedical.min_fee1=100;
	
	
	}

}
