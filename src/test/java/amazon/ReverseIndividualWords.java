package amazon;

public class ReverseIndividualWords {

	public static void main(String[] args) {
		String str = "coding simplified nice";
		
		String finalStr="";
		String tempStr ="";
		
		for(int i= 0 ;i<str.length() ; i++) {
			
			char ch = str.charAt(i);
			if(ch != ' ') {
				
				tempStr = ch + tempStr;
			}
			else {
				finalStr = finalStr + tempStr +" ";
				tempStr =" ";
			}
		}
		finalStr =  finalStr + tempStr;
		System.out.println(finalStr);

	}

}
