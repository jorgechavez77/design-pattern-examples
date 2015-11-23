package org.demo.design.pattern.composite;

import java.util.Iterator;

public class Waitress {

	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n---------");
		while (iterator.hasNext()) {
			MenuComponent component = iterator.next();
			try {
				if (component.isVegetarian()) {
					component.print();
				}
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
			}
		}
	}

}
