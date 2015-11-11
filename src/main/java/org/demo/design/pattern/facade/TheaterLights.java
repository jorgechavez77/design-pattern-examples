package org.demo.design.pattern.facade;

public class TheaterLights {

	public void on() {
		System.out.println("Lights on");
	}

	public void off() {
	}

	public void dim(int val) {
		System.out.println("Lights dim " + val);
	}

}
