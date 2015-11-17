package org.demo.design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MenuTestDrive {

	@Test
	public void test() {

		List<Menu<MenuItem>> menus = new ArrayList<>();
		menus.add(new PancakeHouseMenu());
		menus.add(new DinerMenu());
		menus.add(new CafeMenu());

		Waitress waitress = new Waitress(menus);

		waitress.printMenu();
	}
}
