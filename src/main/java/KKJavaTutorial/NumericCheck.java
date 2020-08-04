package KKJavaTutorial;

public class NumericCheck {

	
	public static boolean isEmpty(CharSequence cs) {
		return cs==null || cs.length()==0;
	}
	
	public static boolean isNumericCheck(CharSequence cs) {
		
		if(isEmpty(cs)) {
			return false;
		}
		int len = cs.length();
		for(int i=0 ; i<len ;i++) {
			
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
				
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		System.out.println(isNumericCheck(null));
		System.out.println(isNumericCheck(" "));
		System.out.println(isNumericCheck("0"));
		System.out.println(isNumericCheck("-11"));
		
		System.out.println(isNumericCheck("1223"));
		
		System.out.println(isNumericCheck("1 1"));

	}

}
