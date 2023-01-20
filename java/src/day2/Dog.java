package day2;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.sound();
	}

	@Override //optional
	public void sound() { // overrided method 
		System.out.println("bow bow");
	}
//Cannot reduce the visibility of the inherited method from Animal
}
