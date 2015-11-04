package org.demo.design.pattern.factory.abstractfactory;

public interface PizzaIngredientFactory {

	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Pepperoni createPepperoni();

	Clams createClam();

}
