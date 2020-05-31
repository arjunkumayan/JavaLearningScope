package CommonlyAskedInterviewQuestions;

public class P39DecimalToOctal {
	
	public static long decimalToOctal(long num)
	{
		long octalNumber =0;
		int i =1;
		
		while(num!=0) {
		
			long remainder =  num % 8;
			num = num/8;
			octalNumber = octalNumber+ remainder * i;
			i =i*10;
			
		}
		return octalNumber;
		
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(decimalToOctal(78));

	}

}
