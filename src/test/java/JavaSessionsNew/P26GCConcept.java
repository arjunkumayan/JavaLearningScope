package JavaSessionsNew;


public class P26GCConcept {

	public static void main(String[] args) {

		P26GCConcept g1 = new P26GCConcept();
		
		g1 = null;
		
		System.gc();
				
	}
	
	@Override
	public void finalize(){
		System.out.println("hello");
	}

}
