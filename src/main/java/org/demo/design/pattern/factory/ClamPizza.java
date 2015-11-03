package org.demo.design.pattern.factory;

import org.demo.design.pattern.factory.abstractfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
