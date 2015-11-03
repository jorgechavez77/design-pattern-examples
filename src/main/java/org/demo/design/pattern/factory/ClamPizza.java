package org.demo.design.pattern.factory;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory factory) {
		this.ingredientFactory = factory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
