package org.demo.design.pattern.factory.abstractfactory;

import org.demo.design.pattern.factory.Cheese;
import org.demo.design.pattern.factory.Clams;
import org.demo.design.pattern.factory.Dough;
import org.demo.design.pattern.factory.Pepperoni;
import org.demo.design.pattern.factory.Sauce;
import org.demo.design.pattern.factory.Veggies;

public interface PizzaIngredientFactory {

	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Pepperoni createPepperoni();

	Clams createClam();

}
