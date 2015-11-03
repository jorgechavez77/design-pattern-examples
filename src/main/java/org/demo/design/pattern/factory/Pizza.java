package org.demo.design.pattern.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	List<String> toppins = new ArrayList<>();

	public abstract void prepare();

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

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce
				+ ", veggies=" + Arrays.toString(veggies) + ", cheese="
				+ cheese + ", pepperoni=" + pepperoni + ", clam=" + clam
				+ ", toppins=" + toppins + "]";
	}

}
