package day1;

public class StringDemo {

	public static void main(String[] args) {

		String food = "panipurichaat";
		System.out.println(food.length());
		System.out.println(food.startsWith("abc"));
		System.out.println(food.endsWith("ri"));
		System.out.println(food.charAt(3));
		System.out.println(food.indexOf("a")); //i know char, i wanna know index
		System.out.println(food.indexOf("p"));// 0 or 4?
		System.out.println(food.lastIndexOf("p"));
		System.out.println(food.contains("ai"));
		System.out.println(food.toUpperCase());
		System.out.println(food.toLowerCase());
		System.out.println(food.replace("p", "z"));
		System.out.println(food.substring(4));
		System.out.println(food.substring(4,8));
		System.out.println(food.trim());
//		System.out.println(food.inter);
	}

}
