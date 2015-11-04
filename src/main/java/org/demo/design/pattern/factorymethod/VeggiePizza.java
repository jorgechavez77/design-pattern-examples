package org.demo.design.pattern.factorymethod;

import org.demo.design.pattern.abstractfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public @Override
	void prepare() {
		// TODO Auto-generated method stub

	}

}
