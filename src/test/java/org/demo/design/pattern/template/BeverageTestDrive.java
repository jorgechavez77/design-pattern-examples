package org.demo.design.pattern.template;

public class BeverageTestDrive {

	public static void main(String[] args) {
		Tea tea = new Tea();
		CaffeinBeverageWithHook coffee = new CoffeeWithHook();

		System.out.println("Making tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
	}

}
