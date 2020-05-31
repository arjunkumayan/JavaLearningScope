package practice;

public class CreateCollege {

	

	public static void main(String[] args) {

		MyUniversity IP = new MyUniversity();
		MyUniversity IP1 = new MyUniversity("Indraprastha university", " Northern india engineering college", "B.tech", 4, "CSE");

		System.out.println("University name= "+IP1.univName + "College name= " + IP1.collegeName + "Course name= " + IP1.courseName + " Course period= " + IP1.courseYears + "Course Name= "
				+ IP1.courseName);
		

		MyUniversity IP2 = new MyUniversity("Indraprastha unviersity", " Maharaja agrasen institue of technology", "B.tech", 4, "ESE");

		System.out.println("University name= "+IP2.univName + " College name=" + IP2.collegeName + "Course name= " + IP2.courseName + " Course period=" + IP2.courseYears + " Course Name="
				+ IP2.courseName);

		
		
		MyUniversity uk = new MyUniversity("Uttrakhand university", " Faculty management school ", "MBA", 3, "Finance");

		System.out.println("University name= "+uk.univName + "College name= " + uk.collegeName + "Course name= " + uk.courseName + " Course period=" + uk.courseYears + "Course Name= "
				+ uk.courseName);
		
		
		MyUniversity DU = new MyUniversity("Delhi University", " KiroriMal college  ", "BSC", 3, "Maths honors");
		System.out.println("University name= "+DU.univName + "College name= " + DU.collegeName + " Course name=" + DU.courseName + "Course period= " + DU.courseYears + "Course Name= "
				+ DU.courseName);
		
		
		MyUniversity DU1 = new MyUniversity("Delhi University", " Sri Ram college of commerce  ", "B.Com", 3, " B.com Honors ");
		System.out.println("University name= "+DU1.univName + "College name= " + DU1.collegeName + "Course name= " + DU1.courseName + "Course period= " +DU1.courseYears + " Course Name="
				+ DU1.courseName);

	}

}
