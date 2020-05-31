package CommonlyAskedInterviewQuestions;

public class SwapNumber {

	public static void main(String[] args) {
    // with temp
	int a = 10;
	int b = 20;
	
	System.out.println("Before swapping:"+"a = "+a+" and b = "+b);
	
	System.out.println("After swapping");
	int temp;
	temp=a;
	a=b;
	b=temp;
	
	System.out.println("a = "+a);
	System.out.println("b= "+b);
	
	
	// without temporary
	
	int p = 40;
	int q = 50;
	
	System.out.println("Before swapping");
	System.out.println("p = "+p);
	System.out.println("q= "+q);
	
	p=p+q; // 90
	q=p-q; // 40
	p=p-q;
	
	System.out.println("After Swapping");
	
	System.out.println("p = "+p);
	System.out.println("q = "+q);
		
		
	}

}
