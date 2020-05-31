package CommonlyAskedInterviewQuestions;

public class NaturalNumSumRecursion {
	
	public static int addNum(int num)
	{
		if(!(num == 0))
		{			
			return num + addNum(num-1);
		}
		else
		{
			return num;
		}
		
		
	}

	public static void main(String[] args) {
		// 5 = 5/4/3/2/1
		int num = 5;
	int sum = addNum(num);
	System.out.println("Sum is: "+sum);

	}

}
