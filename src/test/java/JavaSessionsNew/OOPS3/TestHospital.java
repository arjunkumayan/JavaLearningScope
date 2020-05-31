package JavaSessionsNew.OOPS3;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fs = new FortisHospital();
		fs.ambulanceServices();
		fs.cardioServices();

		fs.medicalInsurance();

		fs.doctorsInternship(100);

		fs.doctorsInternship(100, 30);

		fs.ENTServices();

		fs.freeCamp();

		fs.pathologyServices();
		
		fs.logo();

		USMedical us = new FortisHospital();
		us.logo();
		
		USMedical.parking();
		
		System.out.println(USMedical.min_fee);
		
		//USMedical.min_fee = 100;

	}

}
