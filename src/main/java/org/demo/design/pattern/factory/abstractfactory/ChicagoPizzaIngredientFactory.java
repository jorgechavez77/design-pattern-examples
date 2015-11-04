package org.demo.design.pattern.factory.abstractfactory;

import org.demo.design.pattern.factory.BlackOlives;
import org.demo.design.pattern.factory.EggPlant;
import org.demo.design.pattern.factory.FrozenClam;
import org.demo.design.pattern.factory.Mozarella;
import org.demo.design.pattern.factory.PlumTomatoSauce;
import org.demo.design.pattern.factory.SlicedPepperoni;
import org.demo.design.pattern.factory.Spinach;
import org.demo.design.pattern.factory.ThinCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Spinach(), new BlackOlives(), new EggPlant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClam();
	}

}
