package org.demo.design.pattern.command;

public class Light {

	String name;

	public Light(String name) {
		this.name = name;
	}

	void on() {
		System.out.println("Light is on");
	}

	void off() {
		System.out.println("Light is off");
	}

	@Override
	public String toString() {
		return "Light [name=" + name + "]";
	}

}
