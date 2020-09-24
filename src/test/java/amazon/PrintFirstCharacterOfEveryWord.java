package amazon;

public class PrintFirstCharacterOfEveryWord {

	public static void main(String[] args) {
	String str = " Hello User !! Welcome  ";
	
	char a[] = str.toCharArray();	 
	
	for(int i=0; i<str.length() ; i++) {
		
		if(a[i] !=' ') {
			if(i == 0) {
				System.out.println(a[i]);
			}
			else if(a[i-1] == ' ') {
				System.out.println(a[i]);				
			}
		}
		
		
		}
		
	}

	}


