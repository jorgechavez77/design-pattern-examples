package org.demo.design.pattern.template;

public abstract class CaffeinBeverageWithHook {

	/**
	 * Template Method
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public abstract void addCondiments();

	public boolean customerWantsCondiments() {
		return true;
	}

}
