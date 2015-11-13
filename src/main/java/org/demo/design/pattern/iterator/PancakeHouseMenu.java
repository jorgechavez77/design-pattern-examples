package org.demo.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {

	List<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();

		addItem("K&B's Pancake breakfast",
				"Pancakes with scramble eggs, and toast", true, 2.99);

		addItem("Regular Pancake breakfast",
				"Pancakes with fried eggs, and sausage", false, 2.99);

		addItem("Blueberry Pancakes", "Pancakes made with fress blueberries",
				true, 3.49);

		addItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true, 2.99);
	}

	private void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}

}
