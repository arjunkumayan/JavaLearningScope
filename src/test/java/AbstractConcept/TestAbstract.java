package AbstractConcept;

public class TestAbstract {
	
	

	public static void main(String[] args) {
		//Bus b1 = new Bus();
		//System.out.println(b1.getNoOfWheels());
		//Auto a = new Auto();
	//	System.out.println(a.getNoOfWheels());
		

	}

	abstract class vehicle{
		public abstract int getNoOfWheels();
	}
	
	class Bus extends vehicle{
		public int getNoOfWheels() {
			return 6;
		}
		
	}
	class Auto extends vehicle{
		public int getNoOfWheels() {
			return 4;
		}
		
	}
}
