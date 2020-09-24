package amazon;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "coding simplified nice";
		// nice simplified coding
		String finalStr = " ";
		String tempStr = " ";
		System.out.println(str);
		
		for(int i=0 ; i<str.length() ; i++) {
			
			char ch = str.charAt(i);
			if(ch != ' ') {
				tempStr = tempStr + ch;
			}
			else {
				finalStr = " " + tempStr + finalStr;
				tempStr = "";
			}
		}
		
		finalStr = tempStr + finalStr;
		System.out.println(" final string "+finalStr);

	}

}
