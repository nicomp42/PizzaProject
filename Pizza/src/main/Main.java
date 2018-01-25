package main;
// Hi
import pizza.Pizza;
import pizzaBox.PizzaBox;

public class Main {

	public static void main(String[] args) {
		Pizza myPizza = new Pizza();
		myPizza.addTopping("bacon");
		myPizza.addTopping("pineapple");
		PizzaBox pb = new PizzaBox();
		
		System.out.println(myPizza.toString());
		// Add another topping and print again
		myPizza.addTopping("Sausage");
		System.out.println(myPizza.toString());
	}
}
