package practice;

public abstract class NorthernIndiaEngCollege implements University {

	public static void main(String[] args) {
		//new NorthernIndiaEngCollege().admission();
		
		//University univ=new NorthernIndiaEngCollege();
		//univ.admission();

	}

	@Override
	public void admission() {
		System.out.println("Admission method overriden");
		
	}

	
	public abstract void getSyllabus();
}
