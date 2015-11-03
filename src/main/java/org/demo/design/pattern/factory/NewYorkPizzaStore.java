package org.demo.design.pattern.factory;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
		case "cheese":
			pizza = new NewYorkStyleCheesePizza();
			break;
		case "pepperoni":
			pizza = new NewYorkStylePepperoniPizza();
			break;
		case "clam":
			pizza = new NewYorkStyleClamPizza();
			break;
		case "veggie":
			pizza = new NewYorkStyleVeggiePizza();
			break;
		}
		return pizza;
	}

}
