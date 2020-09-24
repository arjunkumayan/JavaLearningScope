package amazon;

public class ReplaceCharacter {

	public static void main(String[] args) {

		String str = "Hello world welcOme to coding simplified";
		
		char a[] = str.toCharArray();
		
		for(int i= 0 ; i<a.length ; i++) {
			if(a[i] == 'o' || a[i] == 'O') {
				a[i] = 'R';
			}
		}
		
		System.out.println(a);

	}

}
