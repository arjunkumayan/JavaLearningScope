package CommonlyAskedInterviewQuestions;

public class Program20LinearSearch {

	// one by one
	public static void main(String[] args) {

		int arr[] = {10,20,40,50,60};
		int key = 20;
		
		boolean flag= false;
		for(int i=0; i<arr.length ; i++)
		{
			if(key==arr[i])
			{
				System.out.println("Element found is: "+arr[i]);
				flag= true;
				break;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
