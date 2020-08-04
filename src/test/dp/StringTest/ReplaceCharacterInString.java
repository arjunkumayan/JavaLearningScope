package StringTest;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		
		String str = "Hello world!! Welcome to cOding simplified";
		
		char[] ch =str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='o' || ch[i]=='O') {
				ch[i]='y';
			}
		}
		
		System.out.println(String.valueOf(ch));

	}

}
