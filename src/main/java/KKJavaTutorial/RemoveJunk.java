package KKJavaTutorial;

public class RemoveJunk {

	
	public static void main(String[] args) {
	
		String s=" !@#$% Lating String (*334%%% ";
		
		
		// Regular Expression [a-z A-Z0-9]
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");


		System.out.println(s);
		
		

	}

}
