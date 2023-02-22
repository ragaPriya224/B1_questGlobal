package main.java;

public class SingletonMain {

	public static void main(String[] args) {
		// Instantiating Singleton class with variable x
		SingletonPattern x = SingletonPattern.getInstance();

		// Instantiating Singleton class with variable y
		SingletonPattern y = SingletonPattern.getInstance();

		// Instantiating Singleton class with variable z
		SingletonPattern z = SingletonPattern.getInstance();

		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());

		if (x == y && y == z) {
			System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
		} else {
			System.out.println("Three objects DO NOT point to the same memory location on the heap");
		}

	}

}
