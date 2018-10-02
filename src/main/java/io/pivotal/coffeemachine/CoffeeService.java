package io.pivotal.coffeemachine;

import java.util.Map;

public class CoffeeService {

	private Inventory inventory;

	public CoffeeService(Inventory inventory) {
		this.inventory = inventory;
	}

	/**
	 * Returns the menu for this coffee machine.
	 *
	 * @return a map of drink name to drink cost
	 */
	public Map<String, Double> getMenu() {
		return null;
	}

	/**
	 * Make a drink using the given name. Ingredients for the drink are deducted from the inventory.
	 *
	 * @param name the name of the drink
	 */
	public Drink makeDrink(String name) {
	   return null;
	}

}
