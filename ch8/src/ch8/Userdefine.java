package ch8;

class Userexception extends Exception {

	public Userexception(String s) {
		super(s);
	}

}

public class Userdefine {
	public static void main(String[] args) {

		try {
			throw new Userexception("Exception caught");
		} catch (Userexception e) {
			System.out.println(e);
		}

	}
}
