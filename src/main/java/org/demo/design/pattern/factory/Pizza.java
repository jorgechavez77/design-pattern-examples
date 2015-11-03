package org.demo.design.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;

	List<String> toppins = new ArrayList<>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough..." + dough);
		System.out.println("Adding sauce..." + sauce);
		System.out.println("Adding toppings:");
		for (int i = 0; i < toppins.size(); i++) {
			System.out.println(" " + toppins.get(i));
		}
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cut the pizza in diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

}
