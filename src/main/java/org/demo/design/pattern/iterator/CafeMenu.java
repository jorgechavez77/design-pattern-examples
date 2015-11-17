package org.demo.design.pattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu<MenuItem> {

	private Hashtable<String, MenuItem> menuItems = new Hashtable<>();

	public CafeMenu() {
		addItem("Veggie burger and Air fries",
				"Veggie burger on a whole wheat bun, lettuce, tomatoe and fries",
				true, 3.99);
		addItem("Soup of the day",
				"A cup of the soup of the day, with a side salad", false, 3.69);
		addItem("Burrito",
				"A large burrito, with whole pinto beans, salsa, guacamole",
				true, 4.29);
	}

	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	public Hashtable<String, MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

}
