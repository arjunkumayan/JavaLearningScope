package JavaSessionsNew;

public class P14Library {
	
	// Class - Blueprint of specific entity - requirement like of car class
	// then class will give blueprint how exactly these objects will look like
	// different properties need to give
	// Blueprint of different objects

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
	


	public static void main(String[] args) {

	}

}
