package day1;

public class Mobile {

	String colour;
	int price;
	
	Mobile(){
		this.colour = "blue";
		this.price = 100;
	}
	Mobile(String colour){ //parameterized constructor 
		this.colour = colour;
	}
	public static void main(String[] args) {

		Mobile redmi = new Mobile();
//		Mobile -> class name
//		mobile -> reference / object
//		new -> keyword
//		Mobile() -> constructor -> to intialize the object
		redmi.colour = "white";
		System.out.println(redmi.colour);
		System.out.println(redmi.price);
		
		Mobile honor = new Mobile();
		honor.colour = "black";
		System.out.println(honor.colour);
		
		Mobile onePlus = new Mobile("yellow");
		System.out.println(onePlus.colour);
		
		
	}


}
