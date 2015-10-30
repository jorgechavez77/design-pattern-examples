package org.demo.design.pattern.decorator;

public abstract class Beverage {

	private String description = "Unkown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
