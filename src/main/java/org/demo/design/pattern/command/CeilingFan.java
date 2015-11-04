package org.demo.design.pattern.command;

public class CeilingFan {

	String name;

	public CeilingFan(String name) {
		this.name = name;
	}

	void high() {
		System.out.println(name + " ceiling fan is on high");
	}

	void medium() {
		System.out.println(name + " ceiling fan is on medium");
	}

	void low() {
		System.out.println(name + " ceiling fan is on low");
	}

	void off() {
		System.out.println(name + " ceiling fan is off");
	}

	void getSpeed() {
	}

	@Override
	public String toString() {
		return "CeilingFan [name=" + name + "]";
	}

}
