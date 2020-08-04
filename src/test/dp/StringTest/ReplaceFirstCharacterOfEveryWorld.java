package StringTest;

public class ReplaceFirstCharacterOfEveryWorld {

	public static void main(String[] args) {
		
		String str = "Hello world!! Welcome to cOding simplified";
		
		char[] ch =str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]!=' ') {
				
				if(i==0) {
					ch[i]='A';
				}
				else if(ch[i-1]==' ') {
					ch[i]='A';
				}
			}
			
			
		}
		
		System.out.println(String.valueOf(ch));

	}

}
