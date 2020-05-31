package JavaSessionsNew;

public class P25ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("FILE NOT AVAILABLE EXCEPTION");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
