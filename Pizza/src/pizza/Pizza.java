package pizza;
// Hi
import java.util.ArrayList;

import pizzaBox.PizzaBox;

public class Pizza {
	private ArrayList<String> toppings;
	private PizzaBox pizzaBox;	// Has-a relationship. A Pizza has a PizzaBox
	
	// A constructor is special because it runs whenever ... an object is instantiated!
	public Pizza() {
		// Need to instantiate the... toppings ArrayList
		toppings = new ArrayList<String>();
	}
	public PizzaBox getPizzaBox() {
		return pizzaBox;
	}

	public void setPizzaBox(PizzaBox pizzaBox) {
		this.pizzaBox = pizzaBox;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	public void addTopping(String topping) {
		toppings.add(topping);
	}
	// Always add a toString() method
	public String toString() {
		// Your choice
		String result = "";
		for (String t : toppings) {
			result += " " + t;
		}
		return result;
	}
}
