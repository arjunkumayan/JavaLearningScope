package box.test.javaSecondRound;

public class ArrayAssignment {

	public static void main(String[] args) {

		String country[]=new String[4];
		
		country[0]="India";
		country[1]="Uk";
		country[2]="US";
		country[3]="Japan";
			
		
		for(int i=0;i<country.length;i++)
		{
			if(country[i].equals("India"))
			{
				System.out.println("The capital is New Delhi");
			}
			else if(country[i].equals("Uk"))
			{
				System.out.println("The capital is London");
			}
			else if(country[i].equals("US"))
			{
				System.out.println("The capital is New Jersy");
			}
			else if(country[i].equals("japan"))
			{
				System.out.println("The capital is Tokyo");
			}
			else
			{
				System.out.println("The Captial is not defined");
			}
		}
		
		
		
	}

}
