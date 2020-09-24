package amazon;

public class FirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello world java! !! 34";
		
		char ch[] = str.toCharArray();
		
		for(int i = 0 ;i<ch.length ; i++) {
			
			if(ch[i] != ' ') {
				if(i == 0) {
					System.out.println(ch[i]);
				}
				else if(ch[i-1] == ' ') {
					System.out.println(ch[i]);
				}
				
				
			}
		}
	}

}
