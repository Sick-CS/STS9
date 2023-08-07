package ch8;

class UD extends Exception {

	public UD(String s) {
		super(s);
	}

}

public class User {
	public static void main(String[] args) {

		try {
			throw new UD("abc");
		} catch (UD e) {
			System.out.println("expection caught" + " " + e);
		}

	}
}
