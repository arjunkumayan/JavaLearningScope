package CommonlyAskedInterviewQuestions;

public class P40OctalToDecimal {
	public static double convertOctalToDecimal(long num)
	{
		double decimalNumber =0;
		int i =0;
		while(num!=0)
		{
		    long remainder = num %10;	
			num = num /10;
			decimalNumber = decimalNumber +(remainder * Math.pow(8, i));
			++i;
			
		}
		return decimalNumber;
	}

	public static void main(String[] args) {
		  System.out.println(convertOctalToDecimal(65));
		

	}

}
