package JavaInterview;

public class RemoveJunkcharacters {

	public static void main(String[] args) {
		String s = "hddl 7393 ##@%$@5 *^ hell";
		
		// Regular Expressions
		
	s= s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
		
		
		

	}

}
