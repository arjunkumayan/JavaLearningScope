package amazon;

public class ReverseWholeWorld {

	
	public static void main(String[] args) {
		// coding simplified nice
		// ecin deifilpmis gnidoc
		// nice 
		// nice simplified  coding
		
		String finalStr ="";
		String tempStr = "";
		
		String str = "coding simplified nice";
		
		System.out.println("Input string: "+str);
		for(int i =0 ; i<str.length() ; i++) {
			
			char c = str.charAt(i);
			
			if(c != ' ') {
				tempStr = tempStr + c;
				}
			else {
				finalStr = " " + tempStr + finalStr;
				tempStr ="";
				
			}			
			
		}
		finalStr = tempStr + finalStr;
		
		System.out.println("Final String: "+finalStr);
	}
}
