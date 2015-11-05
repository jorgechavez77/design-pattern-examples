package org.demo.design.pattern.command;

public class Hottube {

	void circulate() {
		System.out.println("Hottube is circulating");
	}

	void jetsOn() {
		System.out.println("Hottube jet is on");
	}

	void jetsOff() {
		System.out.println("Hottube jet is off");
	}

	void setTemperature(int temperature) {
		System.out.println("Hottube temperature set to " + temperature);
	}

}
