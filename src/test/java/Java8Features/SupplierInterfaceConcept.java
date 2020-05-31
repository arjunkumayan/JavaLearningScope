package Java8Features;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		// takes No argument and return a result
		
		getText(() -> "java");
		getText(() -> "Arjun");
		getText(() -> "Arjun Automation Labs");
	
	}
	
	public static void getText(Supplier<String> text){
		System.out.println(text.get());
	}

}
