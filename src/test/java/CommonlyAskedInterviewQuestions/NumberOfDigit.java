package CommonlyAskedInterviewQuestions;

public class NumberOfDigit {

	public static void main(String[] args) {

		
		long num = 1;
		
		int count = 0;
		int k =1;
		while(num !=0)
		{
			num = num/10;
			++count;
					
		}
		System.out.println(count);
	}

}
