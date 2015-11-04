package org.demo.design.pattern.factorymethod;

import org.demo.design.pattern.abstractfactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public @Override
	void prepare() {
		// TODO Auto-generated method stub

	}
}
