package org.demo.design.pattern.factory.abstractfactory;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozarella();
	}

	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new Onion(), new BlackOlives(), new RedPepper() };
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
