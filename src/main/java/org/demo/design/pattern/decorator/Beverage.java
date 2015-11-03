package org.demo.design.pattern.decorator;

public abstract class Beverage {

	protected String description = "Unkown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
