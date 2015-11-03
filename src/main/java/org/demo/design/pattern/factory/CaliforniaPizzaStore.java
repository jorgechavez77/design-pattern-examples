package org.demo.design.pattern.factory;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
		case "cheese":
			pizza = new CaliforniaCheesePizza();
			break;
		case "pepperoni":
			pizza = new CaliforniaPepperoniPizza();
			break;
		case "clam":
			pizza = new CaliforniaClamPizza();
			break;
		case "veggie":
			pizza = new CaliforniaVeggiePizza();
			break;
		}
		return pizza;
	}

}
