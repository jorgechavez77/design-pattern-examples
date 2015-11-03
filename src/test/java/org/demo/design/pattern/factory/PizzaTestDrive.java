package org.demo.design.pattern.factory;

import org.junit.Test;

public class PizzaTestDrive {

	@Test
	public void test() {
		PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
		Pizza pizza1 = newYorkPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza1.getName() + "\n");

		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza2.getName() + "\n");
	}

}
