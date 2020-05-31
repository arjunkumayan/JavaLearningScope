package JavaSessionsNew;

public class P27StringManipulation {

	public static void main(String[] args) {

		String str = "I love java but I do not like javascript";
		String str1 = "I love java but I do not like javascript and python";
		System.out.println(str.length());
		
		System.out.println(str.charAt(37));
		System.out.println(str.charAt(4));
		
		/*
		char[] arr = str1.toCharArray();
		for(char c: arr)
		{
			System.out.print(c);
		}
		
		*/
				
		System.out.println(str.charAt(5));
	//	System.out.println(str.charAt(40)); // StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf("love"));
		
		System.out.println(str.indexOf('j'));
		
		System.out.println(str.indexOf("j", str.indexOf("j")+1));
		
		System.out.println(str.indexOf("java"));
		
		if(str.indexOf("Naveen") == -1)
		{
			System.out.println("iindex is not found");
		}
		
        System.out.println(str.indexOf("Naveen")); //-1
		
		if(str.indexOf("python")==-1){
			System.out.println("pass");
		}
		
		//trim:
				String s1 = "     hello world    ";
				System.out.println(s1.trim());
				
				
				//replace:
				String date = "01-01-1995"; //01/01/1995
				System.out.println(date.replace("-", "/"));
				
				//System.out.println(s1.replace(" ", ""));	
				
		// Upper case		
	String name = "my name is arjun singh";
	
	System.out.println(name.toUpperCase());
	
	// Lower case
	String name1 = "MY NAME IS SINGH";
	System.out.println(name1.toLowerCase());
	
	
	}
	
	

}
