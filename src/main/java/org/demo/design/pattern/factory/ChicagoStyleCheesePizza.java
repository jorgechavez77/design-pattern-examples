package org.demo.design.pattern.factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		this.name = "Chicago Style Deep Dish Cheese Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";

		toppins.add("Shredded Mozzarela Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cut pizza into square slices");
	}

}
