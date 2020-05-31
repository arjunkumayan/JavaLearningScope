package LeetCode;

public class StudentArray {
	int id;
	String name;
	
	public StudentArray(int id, String name)
		{
		this.id = id;
		this.name = name;
		}

	public static void main(String[] args) {

		StudentArray arr[] = new StudentArray[6];
		arr[0]= new StudentArray(10,"Arjun");
		arr[1]= new StudentArray(12,"Mahant");
		arr[2]= new StudentArray(14,"Manoj");
		arr[3]= new StudentArray(17,"Mahendra");
		arr[4]= new StudentArray(19,"Rahul");
		arr[5]= new StudentArray(20,"Shyam");
		
		for(int i =0; i<arr.length; i++)
		{
			System.out.println("student details are: "+arr[i].id+" "+arr[i].name);
			
		}
	}

}
