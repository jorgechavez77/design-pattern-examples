package org.demo.design.pattern.factory;

public class NewYorkStyleCheesePizza extends Pizza {

	public NewYorkStyleCheesePizza() {
		this.name = "NY Style Sauce and Cheese Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";

		toppins.add("Great Reggiano Cheese");
	}

}
