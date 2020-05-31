package Util;

public class LibraryClass {

		
	
	public int totalNumberOfBooks()
	{
		int numberOfBook=100;
		
		return numberOfBook;
	}

	public int getSubjectBooks(String category)
	{
		
		if(category.equals("Physics"))
		{
			return 50;
		}
		
		else if(category.equals("Mathematics"))
		{
			return 500;
		}
		
		else
		{
			System.out.println("category books are not available");
			//return -1;
			return 0;
		}
			
		
	}
	
}
