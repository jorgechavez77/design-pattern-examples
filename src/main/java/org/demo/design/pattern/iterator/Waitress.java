package org.demo.design.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {

	private List<Menu<MenuItem>> menus;

	public Waitress(List<Menu<MenuItem>> menus) {
		this.menus = menus;
	}

	public void printMenu() {
		Iterator<Menu<MenuItem>> it = menus.iterator();

		while (it.hasNext()) {
			printMenu(it.next().createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + ", ");
			System.out.println(menuItem.getDescription() + ", ");
		}
	}

}
