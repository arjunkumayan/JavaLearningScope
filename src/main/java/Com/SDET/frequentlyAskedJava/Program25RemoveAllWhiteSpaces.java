package Com.SDET.frequentlyAskedJava;

public class Program25RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		
       String str ="Java programming   selenium   language  ";
       
  //  str = str.replaceAll(" ", "");
    str = str.replaceAll("\\s", "");
    System.out.println(str);

	}

}
