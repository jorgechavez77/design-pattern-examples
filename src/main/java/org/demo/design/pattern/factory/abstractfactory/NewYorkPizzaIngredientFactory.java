package org.demo.design.pattern.factory.abstractfactory;

import org.demo.design.pattern.factory.Cheese;
import org.demo.design.pattern.factory.Clams;
import org.demo.design.pattern.factory.Dough;
import org.demo.design.pattern.factory.FreshClams;
import org.demo.design.pattern.factory.Garlic;
import org.demo.design.pattern.factory.MarinaraSauce;
import org.demo.design.pattern.factory.Mashroom;
import org.demo.design.pattern.factory.Onion;
import org.demo.design.pattern.factory.Pepperoni;
import org.demo.design.pattern.factory.RedPepper;
import org.demo.design.pattern.factory.ReggianoCheese;
import org.demo.design.pattern.factory.Sauce;
import org.demo.design.pattern.factory.SlicedPepperoni;
import org.demo.design.pattern.factory.ThinCrustDough;
import org.demo.design.pattern.factory.Veggies;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

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
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(), new Onion(), new Mashroom(),
				new RedPepper() };
		return veggies;
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
