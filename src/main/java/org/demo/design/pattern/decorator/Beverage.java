package org.demo.design.pattern.decorator;

public abstract class Beverage {

	String description = "Unkown Beverage";
	Size size;

	public String getDescription() {
		return description;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double cost();

}
