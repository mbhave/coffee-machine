package io.pivotal.coffeemachine;

import java.util.Map;

public class Drink {

	/**
	 * Name of the drink.
	 */
	private String name;

	/**
	 * Cost for the drink.
	 */
	private Double cost;

	/**
	 * Map containing ingredients required for making the drink along with the quantity.
	 */
	private Map<String, Integer> ingredients;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Map<String, Integer> getIngredients() {
		return this.ingredients;
	}

	public void setIngredients(Map<String, Integer> ingredients) {
		this.ingredients = ingredients;
	}

}
