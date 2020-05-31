package CommonlyAskedInterviewQuestions;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		int x = 1100;
		int y = 100;
		int z = 1100;
		
		if((x>y) &&(x>z))
		{
			System.out.println(" x is greatest number");
		}
		else if(y>z)
		{
			System.out.println(" y is greatest number");	
		}
		else
		{
			System.out.println(" z is greatest number");
		}
		
		if((x>=y))
		{
			if((x>=z))
			{
				System.out.println("x is greatest number");
			}
			else
			{
				System.out.println("z is the greatest number ");
			}
		}
		else {
			
			if((y>z))
			{
				System.out.println("y is the greatest number");
			}
			else {
				System.out.println(" z is the greatest number");
			}
		}
		
		
		
		
	}

}
