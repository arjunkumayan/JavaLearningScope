package CommonlyAskedInterviewQuestions;

public class P37BinaryToDecimal {
	
	public static double convertBinaryToDecimal(long num)
	{
		long decimalNumber = 0;
		int i = 0;
		while(num!=0)
		{
			long remainder = num%10;
			num =  num/10;
		    decimalNumber +=  remainder * Math.pow(2, i);
			++i;
		}
		
		return decimalNumber;
	}

	public static void main(String[] args) {
		  long num = 10011011;
		  long num1 = 1001;
	     double decimal = convertBinaryToDecimal(num1);
	    System.out.println(decimal);
	  }

}
