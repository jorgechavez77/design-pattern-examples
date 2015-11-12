package org.demo.design.pattern.template;

public abstract class CaffeineBeverage {

	/**
	 * Template Method
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public abstract void addCondiments();

}
