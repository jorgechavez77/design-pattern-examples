package org.demo.design.pattern.factory.factorymethod;

import org.demo.design.pattern.factory.abstractfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
