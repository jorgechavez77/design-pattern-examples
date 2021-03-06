package org.demo.design.pattern.factorymethod;

import org.demo.design.pattern.abstractfactory.NewYorkPizzaIngredientFactory;
import org.demo.design.pattern.abstractfactory.PizzaIngredientFactory;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();

		switch (type) {
		case "cheese":
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Pepperoni Pizza");
			break;
		case "clam":
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
			break;
		case "veggie":
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
			break;
		}
		return pizza;
	}

}
