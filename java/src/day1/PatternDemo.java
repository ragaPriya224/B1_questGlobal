package day1;

public class PatternDemo {

	public static void main(String[] args) {

		for(int i = 1 ; i < 6; i++) { //row //outerloop
			for(int j = 1 ; j <= i; j++) { //inner loop
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
