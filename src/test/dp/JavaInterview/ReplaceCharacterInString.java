package JavaInterview;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		
		String s="Hello world!! Welcome to cOding simplified.";
		
		char ch[] = s.toCharArray();
		
		for(int i=0 ; i<ch.length ; i++) {
			if(ch[i] == 'o' || ch[i]=='O') {
				ch[i] = 'y';
			}
			
			
		}
		System.out.println(ch);
		
		

	}

}
