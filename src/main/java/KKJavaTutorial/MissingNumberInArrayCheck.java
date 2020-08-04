package KKJavaTutorial;

public class MissingNumberInArrayCheck {

	public static void main(String[] args) {
		int a[] = {1,2,4,5};
		
		int len = a.length;
		
		int sum1=0;
		int sum2=0;
		for(int i=0; i<len; i++) {
			
			sum1= sum1+a[i];
			//sum2= sum2+i;
			
			
		}
        for(int j=1; j<=5; j++) {
			
			
			sum2= sum2+j;
			
			
		}
		
		System.out.println("Missing number: "+(sum2-sum1));

	}

}
