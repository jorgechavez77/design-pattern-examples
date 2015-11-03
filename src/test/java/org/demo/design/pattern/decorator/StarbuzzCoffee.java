package org.demo.design.pattern.decorator;

import org.junit.Test;

public class StarbuzzCoffee {

	@Test
	public void test() {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());

		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out
				.println(darkRoast.getDescription() + " $" + darkRoast.cost());

		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $"
				+ houseBlend.cost());
	}

}
