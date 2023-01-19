package day1;

public class FlowControlDemo {

	public static void main(String[] args) {
		
		//break, continue 
//		for(int i = 1 ; i < 6; i++) {
//			if(i == 3) {
//				System.out.println("hello");
//				break;
//			}
//			System.out.println(i);
//		}
		for(int i = 1 ; i < 6; i++) {
			if(i == 3) {
				System.out.println("hello");
				continue; //skip that particular iteration 
			}
			System.out.println(i);
		}

	}

}
