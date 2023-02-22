package main.java.prototype;

/**
 * Client Program
 * @author MEGHNA
 *
 */
public class PrototypeDriver {

	public static void main(String[] args) {
		ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
	}

}