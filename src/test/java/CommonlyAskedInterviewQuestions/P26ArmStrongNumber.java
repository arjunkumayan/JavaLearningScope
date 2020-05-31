package CommonlyAskedInterviewQuestions;

public class P26ArmStrongNumber {

	public static void main(String[] args) {

		int num = 153;  // 1*1*1 + 5*5*5 + 3*3*3 ;
		int actualNumber = num;
		
		double result = 0;
		while(actualNumber != 0)
		{
			int n = actualNumber % 10;
			result = result + Math.pow(n, 3);
			actualNumber = actualNumber / 10;
		}
		if(result ==num)
		{
			System.out.println(num+ " is a Armstrong number");
		}
		else
		{
			System.out.println(num+ " is not a Armstrong number");
		}
	}

}
