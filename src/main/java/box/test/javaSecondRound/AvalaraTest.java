package box.test.javaSecondRound;

public class AvalaraTest {
	
	  public static void doRotateWithNumber(String str1 , String str2) {
		  String finalString = "";
		  for(int i = 0; i<str1.length() ; i++) {
				 
				 finalString =  str1.charAt(i) + finalString;		
		  }
		  
	  }
	

	 public static int doRotateTheString(String str1 , String str2 ) {
		 		 		 
		 if(str1.length() < 0 && str2.length() < 0) {
			 
			 return -1;
		 }
		 
		 
		 String finalString  = "";
		 int counter = 0;
		  while(finalString ==str2) {
		      doRotateWithNumber(str1, str2);
			  counter ++;
			 
		 }
		  System.out.println(finalString);
		  return counter;
		  }
		 
		 
		 
		 
		 
		 
	 
	
	
	public static void main(String[] args) {

		
		String str1 = "ABCD";

		String str2  = "CDAB";
		int totalRotationCount = doRotateTheString(str1, str2);
		System.out.println(totalRotationCount);
		
	}

}
