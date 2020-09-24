package amazon;

public class PrintFirstCharacterOfEveryWD {

	public static void main(String[] args) {
	
		String str = " coding simplified java    ";
		char arr[] = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			
			/*
			 * char c = str.charAt(i); if(c !=' ') { if(i==0) { System.out.println(c); }
			 * else if(str.charAt(i-1)==' ') { System.out.println(c);
			 * 
			 * } }
			 */
			
			if(arr[i] !=' ') {
				if(i == 0) {
					System.out.println(arr[i]);
				}
				else if(arr[i-1] == ' ') {
					System.out.println(arr[i]);
				}
			}
		}
		
		

	}

}
