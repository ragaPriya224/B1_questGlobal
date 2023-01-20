package day2;

public class VarArgsDemoCase {


	public static void main(String[] args) {

		call("hello",4,9,87,4);
		sum();
	}


	static void call(int... args ) {

	}
	static void call(String n, int... args ) {

	}
	static void sum(int n, int... args) {
		System.out.println("2");	
	}
	static void sum(int... args) {
		System.out.println("1");

	}
	

}
