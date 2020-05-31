package JavaSessions;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception{

		loginTest();
		
	}
	
	public static void loginTest() throws Exception{
		launchBrowser();
	}
	
	public static void launchBrowser() throws Exception{
		interactWithBrowser();
	}
	
	public static void interactWithBrowser() throws Exception{
		int i = 9/0;
	}
	
	
	
	

}
