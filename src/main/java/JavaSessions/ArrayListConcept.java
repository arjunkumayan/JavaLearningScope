package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());

		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(12.33);//2
		ar.add(23.44);//3
		
		System.out.println(ar.size());

		ar.add("test");//4
		ar.add("selenium");//5
		
		System.out.println(ar.size());

		//ar.remove(4);
		
		//System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		System.out.println(ar.get(5));
		//System.out.println(ar.get(6));//IndexOutOfBoundsException

		ar.remove(4);
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		//to print all the values from arraylist: for loop
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		//Generics in AarayList:
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		//marksList.add(12.33);
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(12.33);
		
		ArrayList<String> studentNameList = new ArrayList<String>();
		studentNameList.add("Kiran");
		studentNameList.add("Akshay");
		
		
		ArrayList<String> loginPageLinksList = new ArrayList<String>();
		loginPageLinksList.add("Login");//0
		loginPageLinksList.add("Sing Up");//1
		loginPageLinksList.add("Forgot Password");//2
		loginPageLinksList.add("Privacy Policy");//3
		loginPageLinksList.add("Contact Us");//4

		
		System.out.println("total links on login page: "+ loginPageLinksList.size());
		
		for(int linkNum = 0; linkNum<loginPageLinksList.size(); linkNum++){
			System.out.println(loginPageLinksList.get(linkNum));
			
				if(loginPageLinksList.get(linkNum).equals("Forgot Password")){
					System.out.println("click on : "+ loginPageLinksList.get(linkNum));
					break;
				}
				
		}
		
		
	}

}
