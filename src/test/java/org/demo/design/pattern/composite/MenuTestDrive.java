package org.demo.design.pattern.composite;

import org.junit.Test;

public class MenuTestDrive {

	@Test
	public void test() {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU",
				"Brakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Diner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU",
				"Dessert of course!");

		MenuComponent allMenus = new Menu("All MENUS", "All menus combined");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		dinerMenu.add(new MenuItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomatoe on whole wheat", true,
				2.99));
		dinerMenu.add(new MenuItem("BLT",
				"Bacon with lettuce & tomatoe on whole wheat", false, 2.99));
		dinerMenu.add(new MenuItem("Soup of the day",
				"Soup of the day with a side of potato salad", false, 3.29));
		dinerMenu
				.add(new MenuItem(
						"Hotdog",
						"A hot dog, with saurkraut, relish, onions topped, with cheese",
						true, 3.05));

		dinerMenu.add(dessertMenu);

		pancakeHouseMenu.add(new MenuItem("K&B's Pancake breakfast",
				"Pancakes with scramble eggs, and toast", true, 2.99));

		pancakeHouseMenu.add(new MenuItem("Regular Pancake breakfast",
				"Pancakes with fried eggs, and sausage", false, 2.99));

		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
				"Pancakes made with fress blueberries", true, 3.49));

		pancakeHouseMenu.add(new MenuItem("Waffles",
				"Waffles, with your choice of blueberries or strawberries",
				true, 2.99));

		cafeMenu.add(new MenuItem(
				"Veggie burger and Air fries",
				"Veggie burger on a whole wheat bun, lettuce, tomatoe and fries",
				true, 3.99));
		cafeMenu.add(new MenuItem("Soup of the day",
				"A cup of the soup of the day, with a side salad", false, 3.69));
		cafeMenu.add(new MenuItem("Burrito",
				"A large burrito, with whole pinto beans, salsa, guacamole",
				true, 4.29));

		dessertMenu.add(new MenuItem("Apple Pie",
				"Apple pie with flakey crust, topped with vanilla icecream",
				true, 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
