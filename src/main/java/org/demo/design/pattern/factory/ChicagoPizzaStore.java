package org.demo.design.pattern.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
		case "cheese":
			pizza = new ChicagoStyleCheesePizza();
			break;
		case "pepperoni":
			pizza = new ChicagoStylePepperoniPizza();
			break;
		case "clam":
			pizza = new ChicagoStyleClamPizza();
			break;
		case "veggie":
			pizza = new ChicagoStyleVeggiePizza();
			break;
		}
		return pizza;
	}

}
