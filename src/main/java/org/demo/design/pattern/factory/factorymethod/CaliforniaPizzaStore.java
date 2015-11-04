package org.demo.design.pattern.factory.factorymethod;

import org.demo.design.pattern.factory.abstractfactory.CaliforniaPizzaIngredientFactory;
import org.demo.design.pattern.factory.abstractfactory.PizzaIngredientFactory;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

		switch (type) {
		case "cheese":
			pizza = new CheesePizza(ingredientFactory);
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(ingredientFactory);
			break;
		case "clam":
			pizza = new ClamPizza(ingredientFactory);
			break;
		case "veggie":
			pizza = new VeggiePizza(ingredientFactory);
			break;
		}
		return pizza;
	}
}
