package day2;

public class VarArgsDemo {

	public static void main(String... args) {
		
//		display("hello","team");//any number of arguments 
		display(); //zero argument. 
	}
	static void display(String... strings ) {
		System.out.println("display methodis  called");
	}
}
