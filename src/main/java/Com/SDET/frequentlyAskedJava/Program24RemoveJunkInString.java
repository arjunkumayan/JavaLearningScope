package Com.SDET.frequentlyAskedJava;

public class Program24RemoveJunkInString {

	public static void main(String[] args) {

		String str = "!@#$$^&*() hello java 346 test @#$%&";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
