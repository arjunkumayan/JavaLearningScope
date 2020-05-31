package ConstructorConcept;

public class FinalImmutableClass {
	
	
	final int CREATOR;
	
	FinalImmutableClass(int totalYouTubeCount)
	{
		CREATOR= totalYouTubeCount;
	}
	
	public void show()
	{
		System.out.println("total youtube creator are: "+CREATOR);
	}
}
