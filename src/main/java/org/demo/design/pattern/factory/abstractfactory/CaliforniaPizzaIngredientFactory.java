package org.demo.design.pattern.factory.abstractfactory;

import org.demo.design.pattern.factory.Cheese;
import org.demo.design.pattern.factory.Clams;
import org.demo.design.pattern.factory.Dough;
import org.demo.design.pattern.factory.Pepperoni;
import org.demo.design.pattern.factory.Sauce;
import org.demo.design.pattern.factory.Veggies;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return null;
	}

}
