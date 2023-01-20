package day2;

public class OverLoadingCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingCase c = new OverLoadingCase();
//		c.sum(10.0,10);
		c.call(null);
	}

//	public void sum(float f, int i) {
//		System.out.println("hello");
//		System.out.println(f+i);
//	}
	public void sum(int i, float f) {
		System.out.println("bye");
		System.out.println(f+i);
	}
	
	public void call(String o) {
		System.out.println(o);
	}
	public void call(Object o) {
		System.out.println(o);
	}

}
