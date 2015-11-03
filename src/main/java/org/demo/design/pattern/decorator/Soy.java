package org.demo.design.pattern.decorator;

public class Soy extends CondimentDecorator {

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();

		switch (beverage.getSize()) {
		case TALL:
			cost = cost + 0.10;
			break;
		case GRANDE:
			cost = cost + 0.15;
			break;
		case VENTI:
			cost = cost + 0.20;
			break;
		}
		return cost;
	}

}
