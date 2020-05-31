package box.test.javaSecondRound;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(12.33);
		ar.add(23.44);
		
		System.out.println(ar.size());
		
		ar.add("Test");
		ar.add("Selenium");
		
		System.out.println(ar.size());
		
		//ar.remove(4);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		
		System.out.println(ar.get(3));
		
		System.out.println(ar.get(5));
		
		
		//System.out.println(ar.get(6));
		ar.remove(4);
		System.out.println(ar.get(4));
		
		//to print all the values from arraylist: for Loop
		
		for(int i=0;i<ar.size();i++)
		{
			
			System.out.println(ar.get(i));
		}
		
		//generics in ArrayList:
		
		ArrayList<Integer> marksList=new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		marksList.add(400);
		marksList.add(500);
		
		ArrayList<Double> bmiList=new ArrayList<Double>();
		bmiList.add(12.33);
		
		ArrayList<String> studentName=new ArrayList<String>();
		studentName.add("Arjun");
		
		ArrayList<String> loginPageLinksList=new ArrayList<String>();
		loginPageLinksList.add("Login");
		loginPageLinksList.add("Sign Up");
		loginPageLinksList.add("Privacy policy");
		loginPageLinksList.add("Forgot password");
		loginPageLinksList.add("Contact Us");
		
		System.out.println("total links on login page: "+loginPageLinksList.size());
		
		for(int linkNum=0;linkNum<loginPageLinksList.size();linkNum++)
		{
			System.out.println(loginPageLinksList.get(linkNum));
			if(loginPageLinksList.get(linkNum).equals("Privacy policy"))
			{
			System.out.println("Click on: "+loginPageLinksList.get(linkNum));
			break;
		}
		}
		
		
		
		
		
		

	}

}
