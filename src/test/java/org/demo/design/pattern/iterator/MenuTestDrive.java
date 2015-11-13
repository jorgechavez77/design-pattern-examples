package org.demo.design.pattern.iterator;

import org.junit.Test;

public class MenuTestDrive {

	@Test
	public void test() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

		waitress.printMenu();
	}

}
