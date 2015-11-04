package org.demo.design.pattern.command;

public class GarageDoor {

	void up() {
		System.out.println("Garage Door is Open");
	}

	void down() {
		System.out.println("Garage Door is Closed");
	}

	void stop() {
		System.out.println("Garage Door stopped");
	}

	void lightOn() {
		System.out.println("Garage Door's light is on");
	}

	void lightOff() {
		System.out.println("Garage Door's light is off");
	}

}
