package io.pivotal.coffeemachine;


public class TestInventory extends InventoryTests {

	@Override
	protected Inventory getInventory() {
		return new InventoryImpl();
	}


}