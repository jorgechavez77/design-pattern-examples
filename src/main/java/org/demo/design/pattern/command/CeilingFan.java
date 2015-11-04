package org.demo.design.pattern.command;

public class CeilingFan {

	String name;

	public CeilingFan(String name) {
		this.name = name;
	}

	void high() {
	}

	void medium() {
	}

	void low() {
	}

	void off() {
	}

	void getSpeed() {
	}

	@Override
	public String toString() {
		return "CeilingFan [name=" + name + "]";
	}

}
