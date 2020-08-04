package arrayDemo;

public class Student {

	
	public int roll_no;
	public String name;
	
	public Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
				
	}
	public static void main(String[] args) {
		
		Student stu[] = new Student[5];
		stu[0] = new Student(1, "Arjun");
		stu[1] = new Student(2, "Priyank");
		stu[2] = new Student(3, "Prakash");
		stu[3] = new Student(4, "Kuldeep");
		stu[4] = new Student(5, "Mukesh");
		
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println("Studnet roll no: "+stu[i].roll_no + " ... Name:== "+stu[i].name);
			
		}

	}

}
