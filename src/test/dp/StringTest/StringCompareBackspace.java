package StringTest;

public class StringCompareBackspace {
	
	public static boolean ifStringEqualContainingBackspace(String str1,String str2) {
		int end1= str1.length()-1;
		int end2= str2.length()-1;
		
		while(end1>=0  && end2>=0) {
			
			int str1Index= getChar(str1, end1);
			System.out.println("Str1 Index: "+str1Index);
			System.out.println("Str1 char AT: "+str1.charAt(str1Index));
			
			
			int str2Index= getChar(str2, end2);
			System.out.println("Str2 Index: "+str2Index);
			System.out.println("Str2 char AT: "+str2.charAt(str2Index));
			
			if(str1Index <0 && str2Index<0) {
				return true;
				
			}
			if(str1Index <0 || str2Index<0) {
				return false;
				
			}
			if(str1.charAt(str1Index)!=str2.charAt(str2Index)) {
				//System.out.println(str1.charAt(str1Index));
				//System.out.println(str2.charAt(str2Index));
				return false;
			}
			end1 = str1Index-1;
			end2 = str2Index-1;
					
		}
		
		return true;
		
	}
	/**
	 * this will return the index
	 * @param str  this is string passed
	 * @param end it is the index we are starting from end
	 * @return
	 */
	private static int getChar(String str,int end) {
		int specialCharacter =0;
		
		while(end>=0) {
			if(str.charAt(end)!='#') {				
				if(specialCharacter==0) {
					return end;
					}
				else {
					specialCharacter--;
					//System.out.println(specialCharacter);
					}
			}
			else {
				specialCharacter++;
			}
			end--;
		}
		
		
		return end;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		String str1= "fbcd##c";
		String str2 = "fbd#c";
		
		//System.out.println(getChar(str1, str1.length()-1));
		//System.out.println(getChar(str1, str1.length()-5));
		
		System.out.println(ifStringEqualContainingBackspace(str1, str2));

	}

}
