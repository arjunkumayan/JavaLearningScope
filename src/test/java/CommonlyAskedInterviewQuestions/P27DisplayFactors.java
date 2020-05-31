package CommonlyAskedInterviewQuestions;

public class P27DisplayFactors {

	public static void main(String[] args) {

		// 5! = 5*4*3*2*1
		
		int num = 60;
		int result = 1;
		
		/*
		 * while(num != 0) { result = result*num;
		 * 
		 * --num;
		 * 
		 * } System.out.println("Factor of a number is: "+result);
		 */
		
		for( int i=1; i<=num ; i++)
		{
			if(num%i == 0)
			{
				System.out.println(i);
			}
			
		}
	}

}
