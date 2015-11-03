package org.demo.design.pattern.factory.factorymethod;

import org.demo.design.pattern.factory.CheesePizza;
import org.demo.design.pattern.factory.ClamPizza;
import org.demo.design.pattern.factory.PepperoniPizza;
import org.demo.design.pattern.factory.Pizza;
import org.demo.design.pattern.factory.VeggiePizza;
import org.demo.design.pattern.factory.abstractfactory.ChicagoPizzaIngredientFactory;
import org.demo.design.pattern.factory.abstractfactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

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
