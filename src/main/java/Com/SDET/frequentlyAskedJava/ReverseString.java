package Com.SDET.frequentlyAskedJava;

public class ReverseString {

	public static void main(String[] args) {
		
		//1 using + (String Concatenation) operator
		
		String str="Arjun";
		String rev=" ";
				
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
						
		}
		
		System.out.println("The reverse number is= "+rev);
		
		// 2. using Character Array
		
		char a[]=str.toCharArray();
		int lenArray=a.length;
		String reverse=" ";
		
		
		for(int j=lenArray-1;j>=0;j--)
		{
			reverse=reverse+a[j];
		}
		System.out.println("Reverse using character Array= "+reverse);
		
		
		//3. /using StringBuffer
		
		
		//StringBuffer sb=StringBuffer(str);
	
		StringBuffer sb = new StringBuffer(String.valueOf(str));
		StringBuffer sb1 = sb.reverse();
		System.out.println("String reverse is: "+sb1);
		
		//
		
		
	String rev1=    reverStringUsingCharAt("machine learning");
	String rev2 =	reverStringUsingCovertToArray("Temp123 test");
	System.out.println(rev1);
	System.out.println(rev2);
	}

	private static StringBuffer reverseUsingStringBuffer(String str) {
		StringBuffer sb = new StringBuffer(String.valueOf(str));
		return sb.reverse();
	
	}
	
	
	public static String reverStringUsingCharAt(String str)
	{
		String rev =" ";
		int length  = str.length();
		
		for(int i=length-1 ; i>=0 ; i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
			
		
	}
	
	public static String reverStringUsingCovertToArray(String str)
	{
		char a[] = str.toCharArray();
		int length  = a.length;
		String rev = " ";
		
		for(int i = length-1; i>0 ; i--)
		{
			
			rev= rev + a[i];
		}
		return rev;
	}

}
