package box.test.javaSecondRound;

import java.util.ArrayList;

public class FunctionsConcept {

	public static void main(String[] args) 
	
	{
		//Call a function
		String str1="Arjun";
		String str2="Arjun";
		
		int a=10;
		int b=10;
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		
		FunctionsConcept obj=new FunctionsConcept();
		obj.getMycontry();
		obj.getPlayerCountry("Sachin");
		obj.getPlayerName();
		obj.getStudentDeatails();
		int t=obj.getStudMarks("ddd");
		System.out.println("the mehtod value is"+t);
		obj.test();
		String trainer=obj.getTrainerName();
		System.out.println(trainer);

		String details[]=obj.getStudentDeatails();
		int size=details.length;
		
		for(int i=0;i<size;i++)
		{
			System.out.println(details[i]);
		}
		
		int sum=obj.addition(10, 20);
		
		System.out.println(sum);
		String tenantDetails[]=new String[3];
		tenantDetails[0]="Arjun";
		tenantDetails[1]="Kuldeep";
				tenantDetails[2]="Priyank";
		
		obj.flatDetails("Anita",tenantDetails);
		
		
	}
		
	
	//Can not create a function inside a functions
	// duplicate function are not allowed
	
	//1. simple function: No input and no return
	// void does not return anything
	
	public void test()
	{
		System.out.println("test method");
	}
	public void getMycontry(){
		System.out.println("India");
		String name="Arjun";
		System.out.println(name);
	}
	
	//2. no input but some return
	public String getTrainerName()
	{
		String name1="naveen";
		return name1;
	}
	public int sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	
	
	public String[] getStudentDeatails() {
		String stu[]=new String[3];
		stu[0]="Arjun";
		stu[1]="Paras";
		stu[2]="Naveen";
		
		return stu;
	}
	
	public ArrayList<String> getPlayerName()
	{
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Sachin");
		arr.add("Virat");
		arr.add("Dhoni");
		return arr;
	}
	
	//3. some input and some return
	public int addition(int a,int b)
	{
		System.out.println("Addition method");
		int c=a+b;
		return c;
	}
	public String getPlayerCountry(String playerName)

	{
		if(playerName.equals("Sachin"))
		{
			return "india";
		}
		
		else if(playerName.equals("Ricky"))
		{
			return "Australia";
		}
		else if(playerName.equals("jason"))
		{
			return "England";
		}
		return null;
	}
  
	public boolean iscitizen(String personName)
	{
		if(personName.equals("Naveen"))
		{
			return true;
		}
		else if(personName.equals("Irina"))
		{
			return false;
		}
		return false;
	}
	
	public int getStudMarks(String stuName)
	{
		if(stuName.equals("nisha"))
		{
			return 90;
		}
		else if(stuName.equals("suraj"))
		{
			return 80;
		}
		else if(stuName.equals("Mohit"))
		{
			return 50;
		}
		else
		{
			System.out.println(stuName+" is not defined in the list ");
			return -1;
		}
		
	
	}
	
	public void flatDetails(String owner,String tenant[])
	{
		System.out.println("The flat owner is: "+owner);
		int len=tenant.length;
		for(int i=0;i<len;i++)
		{System.out.println("The flatmates details is:"+tenant[i]);
			
		}
		
	}
	
	public void gymMachines(String machine)
	{
		
	}


}
