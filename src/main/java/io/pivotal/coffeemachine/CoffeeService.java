package io.pivotal.coffeemachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeService {

	private Inventory inventory;

	public CoffeeService(Inventory inventory) {
		this.inventory = inventory;
	}
	
	private static 	Map<String, Double> menu = new HashMap<>();
	
	static {
		 menu.put("coffee", 2.75);
		 menu.put("cappuccino", 2.90);
		 menu.put("caffe mocha", 3.90);
		 
	}
	
	
	/**
	 * Returns the menu for this coffee machine.
	 *
	 * @return a map of drink name to drink cost
	 */
	public Map<String, Double> getMenu() {  
		return menu;
	}

	/**
	 * Make a drink using the given name. Ingredients for the drink are deducted from the inventory.
	 *
	 * @param name the name of the drink
	 */
	public Drink makeDrink(String name) {
		
		Drink drink = new Drink();
		
		drink.setName(name);
		drink.setCost( menu.get(name));
		
		Map<String, Integer> ingredients = new HashMap<>();

		switch(name.toLowerCase()) {
		
		case "coffee":
					
					if(inventory.getIngredients().get("coffee") > 0 &&  inventory.getIngredients().get("sugar") > 0
							&& inventory.getIngredients().get("cream") >0) {
						ingredients.put("coffee", 1);
						ingredients.put("sugar", 1);
						inventory.deduct("coffee", 1);
						inventory.deduct("sugar", 1);
					}else {
						throw new RuntimeException("there are no ingredients");
					}
						break;
		
		case "cappuccino":
			
			if(inventory.getIngredients().get("coffee") > 0 &&  inventory.getIngredients().get("sugar") > 0
					&& inventory.getIngredients().get("cream") >0) {
				
					ingredients.put( "coffee", 2);
					ingredients.put("sugar", 1);
					ingredients.put("cream", 1);
					
					inventory.deduct( "coffee", 2);
					inventory.deduct("sugar", 1);
					inventory.deduct("cream", 1);
					}else {
						throw new RuntimeException("there are no ingredients");
					}
					break;
					
		case "caffe mocha":
					if(inventory.getIngredients().get("coffee") > 0 &&  inventory.getIngredients().get("sugar") > 0
							&& inventory.getIngredients().get("cream") >0) {
						ingredients.put( "coffee", 1);
						ingredients.put("sugar", 1);
						ingredients.put("cream", 1);
						
						inventory.deduct( "coffee", 1);
						inventory.deduct("sugar", 1);
						inventory.deduct("cream", 1);
					}else {
						throw new RuntimeException("there are no ingredients");
					}
					break;
		}
		drink.setIngredients( ingredients );
		return drink;
	}

}
