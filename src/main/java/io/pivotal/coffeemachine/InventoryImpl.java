package io.pivotal.coffeemachine;

import java.util.HashMap;
import java.util.Map;

public class InventoryImpl implements Inventory {

	
	
	@SuppressWarnings("unchecked")
	private static 	Map<String,Integer> map = new HashMap<>();
	
	static {
		
		map.put("coffee", 10);
		map.put("sugar", 10);
		map.put("cream", 10);
	}
	
	@Override
	public Map<String, Integer> getIngredients() {
		 return map;
	}
	
	@Override
	public void deduct(String name, Integer amount) {

		if(map.containsKey(name)) {
			Integer quantity = map.get(name);
			map.put(name, quantity-amount);
		}
		else {
			throw new RuntimeException("No Ingredients");
		}
		  
	}

}
