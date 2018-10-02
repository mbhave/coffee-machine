package io.pivotal.coffeemachine;

import java.util.Map;

public interface Inventory {

	/**
	 * Returns all the ingredients available in the inventory along with their quantities.
	 *
	 * @return a map containing the name of the ingredient to the available quantity.
	 */
	Map<String, Integer> getIngredients();

	/**
	 * Reduce the quantity of the given ingredient by the given amount.
	 *
	 * @param name the name of the ingredient to reduce
	 * @param amount the quantity to reduce by
	 */
	void deduct(String name, Integer amount);
}
