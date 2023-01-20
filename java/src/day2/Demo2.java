package day2;

public class Demo2{

	static void test(int ... vargs) {
		// method body
	}

	static void test(int n, int ... vargs) {
		// method body
	}
	static void call(int ... vargs) {
		// method body
	}

	static void call(String n, int ... vargs) {
		// method body
	}
	public static void  main(String[] args) {
//		test(1,2,3,4);
		call("abc",4,5,6,76);
	}
}