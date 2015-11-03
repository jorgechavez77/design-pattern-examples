package org.demo.design.pattern.factory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub

	}
}
