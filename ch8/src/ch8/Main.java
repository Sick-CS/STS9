package ch8;

class A {

	void meth() {

		try {
			int a[] = new int[5];
			a[5] = 20 / 0;

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException p) {
			System.out.println(p);
		}finally {
			System.out.println("finally");
		}

	}

	void meth1() {
		meth();
	}

	void meth2() {
		meth1();
	}

}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.meth2();
	}
}
