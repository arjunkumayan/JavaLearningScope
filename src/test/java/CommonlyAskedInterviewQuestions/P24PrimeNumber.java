package CommonlyAskedInterviewQuestions;

public class P24PrimeNumber {

	public static void main(String[] args) {
   // 1,2 3,5,7,13
		
		int num = 11;
		boolean flag = false;
		
		for(int i=2; i<=num/2 ;i++)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println(num+ " is a prime number");
		}
		else
		{
			System.out.println(num+ " is not a prime number");
		}
		
		}
		
	}

