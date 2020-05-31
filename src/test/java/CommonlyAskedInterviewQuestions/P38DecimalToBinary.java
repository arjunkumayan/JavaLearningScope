package CommonlyAskedInterviewQuestions;

public class P38DecimalToBinary {
	
	public static long convertDecimalToBinary(long num)
	{
		int i =1;
		long binaryNumber = 0;
		long remainder =1;
		while(num!=0)
		{
			
			remainder = num % 2;
			num =  num/2;
			
			binaryNumber = binaryNumber+ remainder*i; 
			System.out.println("Binary"+binaryNumber);
			i = i*10;
			System.out.println(i);
			
		}
		return binaryNumber;
		
		
	}

	public static void main(String[] args) {

      long num = 156;
		// 156 =  10011100 2
    long binary = convertDecimalToBinary(num);
    System.out.println(binary);
      
	}

}
