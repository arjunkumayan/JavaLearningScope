package box.test.util;

public class Library {
	
	// this is create to test the import statement check
	public int totalnumberOfbooks()
	{
		int numberOfbooks=100;
		return numberOfbooks;
	}

	public int getSubjectBooks(String category)
	{
		if(category.equals("physics"))
		{
			return 1000;
		}
		else if(category.equals("maths"))
		{
			return 500;
		}
		else {
			System.out.println("Category books are not availaable");
			return -1;
		}
		
	}
}





