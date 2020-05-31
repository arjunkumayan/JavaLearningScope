package box.test.javaSecondRound;

public class ArrayConcept {

	public static void main(String[] args) {
		//int array
		
		int arr[]=new int[4];
		
		//double array
		double arr1[]=new double[4];
		
		//String array
		String str[]=new String[4];
		
		str[0]="Irina";
		str[1]="Arjun";
		str[2]="Sumi";
		str[3]="Paras";
		
		for(int count=0;count<str.length;count++)
		{
			if(str[count].equals("Irina"))
			{
				System.out.println(str[count]+" She is Russian");
			}
			else if(str[count].equals("Arjun"))
			{
				System.out.println(str[count]+" he is Indian");
			}
			else if(str[count].equals("sumi"))
			{
				System.out.println(str[count]+" She is bangladeshi");
			}
			else if(str[count].equals("Paras"))
			{
				System.out.println(str[count]+" he is from America");
			}
			else
			{
				System.out.println("Student is not defined");
			}
		}
		
	}

}
