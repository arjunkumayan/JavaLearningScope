package CommonlyAskedInterviewQuestions;

public class LeapYear {

	public static void main(String[] args) {

		// the year which is divisible by 4 for all the century year -- ending with 00
		
		// century year is a leap year only when it is perfectly divisible by 400
		// 1900  - not a leap year
		// 2012  - 
		
		
		int year = 2015;
		
		boolean leap = false;
		
		if((year%4 ==0))
				{
			        if((year % 100 == 0))
			        {
			        	if((year % 400 == 0))
			        	{
			        		leap= true;
			        		
			        	}
			        	else
			        	{
			        		leap = false;
			        	}
			        	
			        }
			        else
			        {
			        	leap = true;
			        }
			        	
			       
				}
		else {
			
			leap = false;
		}
		if(leap) {
			
			System.out.println(" leap year");
		}
		else
		{
			System.out.println(" not a leap year");
		}
		
		
		
	}

}
