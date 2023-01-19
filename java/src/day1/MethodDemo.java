package day1;

public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		m.subtract(5.0, 2);
	}

	public int subtract (int num1, int num2) {
		int result = num1 - num2;
		System.out.println("coding");
		System.out.println(result);
		return result;
	}
	public void subtract (double num1, double num2) {
		System.out.println("welcome");
		System.out.println(num1 - num2);
	}
	
	public void doPrint () {
		System.out.println("hello");
	}
	public int doSum () {
		int num = 2+3;
		return num;
	}



}
